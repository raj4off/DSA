package trees.binaryTrees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTree_4_LevelOrder {
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
        List<List<Integer>> result = levelOrderTraverse(treeNode);
        result.forEach(System.out::println);
    }


    public static List<List<Integer>> levelOrderTraverse(TreeNode node){
        List<List<Integer>> result = new ArrayList<>();
        if(node == null) return result;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(node);
        while(!queue.isEmpty()){
            int levelNum = queue.size();
            List<Integer> currentLevel = new ArrayList<>();
            for(int i = 0; i<levelNum; i++){
                if(queue.peek().left != null) queue.offer(queue.peek().left);
                if(queue.peek().right != null) queue.offer(queue.peek().right);
                currentLevel.add(queue.poll().val);
            }
            result.add(currentLevel);
        }
        return result;
    }



}
