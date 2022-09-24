//Task description: https://www.codewars.com/kata/57e5279b7cf1aea5cf000359

class Solution {
    static int maxSum(TreeNode node) {
      if (node == null) { return 0; }

      return java.lang.Math.max((maxSum(node.left) + node.value), maxSum(node.right) + node.value);
    }
}