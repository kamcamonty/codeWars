//Task description: https://www.codewars.com/kata/55cf9b9e66e66c42fa000013
function recordDepth(tree) {
    if(typeof tree != 'object' || Array.isArray(tree) || tree == null) return null;
    var d = 0;
    
    function iterativePart(tree){
        tree.depth = d;
    
       Object.keys(tree).forEach(key => {
        if(typeof tree[key] === 'object') {
            tree[key].depth = d;
            d = d + 1;
            iterativePart(tree[key]);
        }
      });
  return tree;
}
  return iterativePart(tree);
}