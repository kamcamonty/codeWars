//Task description: https://www.codewars.com/kata/57dd79bff6df9b103b00010f

public class TreeNode {

    TreeNode left;
    TreeNode right;

    public static boolean isPerfect(TreeNode node) {
      if (node == null) { return true; }
      
      if (node.left != null & node.right != null)
          {
            if((node.left.right == null & node.right.right != null) | (node.left.right != null & node.right.right == null))
               {return false;}
          }
      
      if ((node.left == null & node.right != null) | (node.right == null & node.left != null))
          { return false;}

      return isPerfect(node.left) & isPerfect(node.right);
    }
    
    static TreeNode leaf() {
        return new TreeNode();
    }

    static TreeNode join(TreeNode left, TreeNode right) {
        return new TreeNode().withChildren(left, right);
    }

    TreeNode withLeft(TreeNode left) {
        this.left = left;
        return this;
    }

    TreeNode withRight(TreeNode right) {
        this.right = right;
        return this;
    }

    TreeNode withChildren(TreeNode left, TreeNode right) {
        this.left = left;
        this.right = right;
        return this;
    }

    TreeNode withLeftLeaf() {
        return withLeft(leaf());
    }

    TreeNode withRightLeaf() {
        return withRight(leaf());
    }

    TreeNode withLeaves() {
        return withChildren(leaf(), leaf());
    }
}