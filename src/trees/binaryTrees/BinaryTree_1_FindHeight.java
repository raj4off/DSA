package trees.binaryTrees;


public class BinaryTree_1_FindHeight {
    public static class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
    }

    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(1, new TreeNode(2), new TreeNode(3, new TreeNode(4), new TreeNode(5)));
        TreeNode treeNode1 = new TreeNode(1);
        System.out.println(findHeight(treeNode));
    }

    public static int findHeight(TreeNode treeNode){
        if(treeNode == null) return -1;
        int leftHeight = findHeight(treeNode.left);
        int rightHeight = findHeight(treeNode.right);
        return Math.max(leftHeight, rightHeight)+1;
    }
}
