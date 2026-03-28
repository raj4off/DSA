package trees.binaryTrees;

import java.util.*;

public class BinaryTree_12_TopView {

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

    public static class Pair{
        TreeNode node;
        int hd;
        Pair(TreeNode node, int hd){
            this.hd = hd;
            this.node = node;
        }
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1, new TreeNode(2, new TreeNode(11), new TreeNode(12)), new TreeNode(3, new TreeNode(4), new TreeNode(5)));

        List<Integer> result = getTopView(root);

        System.out.println(result);
    }

    public static List<Integer> getTopView(TreeNode root){
        List<Integer> result = new ArrayList<>();
        Queue<Pair> queue = new LinkedList<>();
        Map<Integer, Integer> map = new TreeMap<>();

        if(root == null) return result;
        queue.add(new Pair(root, 0));

        while(!queue.isEmpty()){
            Pair it = queue.remove();
            int hd = it.hd;
            TreeNode node = it.node;
            map.computeIfAbsent(hd, k -> node.val);
            if(node.left != null){
                queue.add(new Pair(node.left, hd-1));
            }
            if(node.right != null){
                queue.add(new Pair(node.right, hd+1));
            }
        }

        result.addAll(map.values());
        return result;
    }

}
