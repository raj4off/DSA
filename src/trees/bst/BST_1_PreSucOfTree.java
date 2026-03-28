package trees.bst;

public class BST_1_PreSucOfTree {
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
        TreeNode left = new TreeNode(2, new TreeNode(1), new TreeNode(4));
        TreeNode right = new TreeNode(10, new TreeNode(7), new TreeNode(12));

        TreeNode root = new TreeNode(5, left, right);
        int[] res = new int[]{-1, -1};
        int target = 5;
        find(root, target, res);
        System.out.println("Predecessor: "+res[0]+" Successor: "+res[1]);
    }

    private static void find(TreeNode root, int target, int[] res){
        while(root != null){
            if(root.val == target){
                if(root.left != null){
                    TreeNode temp = root.left;
                    while(temp.right != null){
                        temp = temp.right;
                    }
                    res[0] = temp.val;
                }
                if(root.right != null){
                    TreeNode temp = root.right;
                    while(temp.left != null){
                        temp = temp.left;
                    }
                    res[1] = temp.val;
                }
                break;
            } else if(target < root.val){
                res[1] = root.val;
                root = root.left;
            } else {
                res[0] = root.val;
                root = root.right;
            }
        }
    }
}
