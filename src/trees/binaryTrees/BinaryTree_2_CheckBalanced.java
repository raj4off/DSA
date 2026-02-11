package trees.binaryTrees;


public class BinaryTree_2_CheckBalanced {
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
        System.out.println(getHeight(treeNode) != -1);
    }
    
    public static int getHeight(TreeNode treeNode){
        if(treeNode == null) return 0;
        
        int leftH = getHeight(treeNode.left);
        if(leftH == -1) return -1;

        int rightH = getHeight(treeNode.right);
        if(rightH == -1) return -1;

        if(Math.abs(leftH-rightH) > 1) return -1;
        return Math.max(leftH, rightH) + 1;
        
    }
}
