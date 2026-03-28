package trees.binaryTrees;

public class BinaryTree_14_ChildrenSumProperty {

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
        TreeNode node = new TreeNode(40, new TreeNode(10, new TreeNode(2), new TreeNode(5)), new TreeNode(20, new TreeNode(30), new TreeNode(40)));
        preOrder(node);
        System.out.println();
        changeTree(node);
        preOrder(node);
    }

    private static void changeTree(TreeNode root){
        if(root == null) return;
        int child = 0;

        if(root.left != null){
            child += root.left.val;
        }
        if(root.right != null){
            child += root.right.val;
        }

        if(child >= root.val) root.val = child;
        else{
            if(root.left != null) root.left.val = root.val;
            else if(root.right != null) root.right.val = root.val;
        }
        changeTree(root.left);
        changeTree(root.right);

        int tot = 0;
        if(root.left != null) tot+=root.left.val;
        if(root.right != null) tot+=root.right.val;
        if(root.left != null || root.right != null) root.val = tot;
    }

    private static void preOrder(TreeNode root){
        if(root == null) return;
        System.out.print(root.val+" ");
        preOrder(root.left);
        preOrder(root.right);
    }
}
