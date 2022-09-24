//Task description: https://www.codewars.com/kata/5800580f8f7ddaea13000025
// return the sum of all values in the tree, including the root
function sumTheTreeValues(node){
    if(node == null) return 0;
    var sum = node.value;
    if (node.left != null) sum = sum + sumTheTreeValues(node.left);
    if (node.right != null) sum = sum + sumTheTreeValues(node.right);
    return sum;
  }