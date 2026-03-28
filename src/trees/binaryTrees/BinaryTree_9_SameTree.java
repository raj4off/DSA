package trees.binaryTrees;

public class BinaryTree_9_SameTree {
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
        TreeNode root1 = new TreeNode(1, new TreeNode(2), new TreeNode(3, new TreeNode(4), new TreeNode(5)));
        TreeNode root2 = new TreeNode(1, new TreeNode(2, new TreeNode(11), new TreeNode(12)), new TreeNode(3, new TreeNode(4), new TreeNode(5)));

        System.out.println(findIfSameTree(root1,root2));
    }

    private static boolean findIfSameTree(TreeNode p, TreeNode q){
        if(p==null || q==null) return p==q;
        return (p.val==q.val) && findIfSameTree(p.left, q.left) && findIfSameTree(p.right, q.right);
    }
}
