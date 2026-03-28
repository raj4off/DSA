package trees.binaryTrees;

public class BinaryTree_7_DiameterOfTree {
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
        int[] arr = new int[]{0};
        findDiameter(treeNode, arr);
        System.out.println(arr[0]);
    }

    private static int findDiameter(TreeNode node, int[] arr){
        if(node == null) return 0;
        int leftMax = findDiameter(node.left, arr);
        int rightMax = findDiameter(node.right, arr);
        arr[0] = Math.max(arr[0], leftMax+rightMax);
        return Math.max(leftMax, rightMax)+1;
    }
}
