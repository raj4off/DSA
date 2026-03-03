package trees.binaryTrees;

public class BinaryTree_3_PreOrder {

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
        inOrder(treeNode);
    }

    private static void preOrder(TreeNode node){
        if(node == null) return;
        System.out.println(node.val);
        preOrder(node.left);
        preOrder(node.right);
    }

    private static void inOrder(TreeNode node){
        if(node == null) return;
        inOrder(node.left);
        System.out.println(node.val);
        inOrder(node.right);
    }

    private static void postOrder(TreeNode node){
        if(node == null) return;
        postOrder(node.left);
        postOrder(node.right);
        System.out.println(node.val);
    }


}
