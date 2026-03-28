package trees.binaryTrees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTree_10_ZigZagLevelOrder {
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
        TreeNode root = new TreeNode(1, new TreeNode(2, new TreeNode(11), new TreeNode(12)), new TreeNode(3, new TreeNode(4), new TreeNode(5)));
        List<List<Integer>> result = levelOrder(root);

        for(List<Integer> level : result){
            System.out.println(level);
        }
    }

    private static List<List<Integer>> levelOrder(TreeNode node){
        List<List<Integer>> result = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();

        if(node == null) return result;
        boolean leftToRight = true;
        queue.add(node);
        while(!queue.isEmpty()){
            int n = queue.size();
            List<Integer> level = new LinkedList<>();
            for(int i = 0; i<n; i++){
                node = queue.poll();
                if(leftToRight) level.addLast(node.val);
                else level.addFirst(node.val);
                if(node.left!=null) queue.add(node.left);
                if(node.right!=null) queue.add(node.right);
            }
            result.add(level);
            leftToRight = !leftToRight;
        }

        return result;
    }
}
