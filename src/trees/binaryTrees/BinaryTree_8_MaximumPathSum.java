package trees.binaryTrees;

public class BinaryTree_8_MaximumPathSum {

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
        TreeNode root = new TreeNode(-10, new TreeNode(9), new TreeNode(20, new TreeNode(15), new TreeNode(7)));
        int[] max = new int[1];
        max[0] = Integer.MIN_VALUE;
        maxPathSum(root, max);
        System.out.println(max[0]);
    }

    private static int maxPathSum(TreeNode node, int[] arr){
        if(node == null) return 0;
        int leftSum = Math.max(0,maxPathSum(node.left, arr));
        int rightSum = Math.max(0,maxPathSum(node.right, arr));
        arr[0] = Math.max(arr[0], leftSum+rightSum+node.val);
        return Math.max(leftSum, rightSum)+node.val;
    }
}
