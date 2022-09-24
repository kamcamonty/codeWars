// Task description: https://www.codewars.com/kata/5a04450c8ba914083700000a

public class FindMaxValueInTree {
    static int findMax(TreeNode  node) {  
      if (node.left == null & node.right == null) { return node.value;}
      if (node.left == null) { return java.lang.Math.max(findMax(node.right), node.value);}
      if (node.right == null) { return java.lang.Math.max(findMax(node.left), node.value);}

      return java.lang.Math.max(java.lang.Math.max(findMax(node.right), findMax(node.left)), node.value); 
          }
}