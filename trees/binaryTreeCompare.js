//Task description: https://www.codewars.com/kata/55847fcd3e7dadc9f800005f

function compare(a, b){
    if(!a && !b) return true;
    if((!a && b) || (a && !b)) return false;
    if(a.val != b.val) return false;
  
    return compare(a.right, b.right) && compare(a.left, b.left);
  }