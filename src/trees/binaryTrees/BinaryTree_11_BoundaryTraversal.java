package trees.binaryTrees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class BinaryTree_11_BoundaryTraversal {

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

    private static boolean isLeaf(TreeNode node){
        return (node.left == null && node.right == null);
    }

    private static void addLeftBoundary(TreeNode node, List<Integer> result){
        TreeNode cur = node.left;
        while(cur!=null){
            if(!isLeaf(cur)) result.add(cur.val);
            if(cur.left != null) cur = cur.left;
            else cur = cur.right;
        }
    }

    private static void addRightBoundary(TreeNode node, List<Integer> result){
        List<Integer> list = new LinkedList<>();
        TreeNode cur = node.right;
        while(cur!=null){
            if(!isLeaf(cur)) list.addFirst(cur.val);
            if(cur.right != null) cur = cur.right;
            else cur = cur.left;
        }
        result.addAll(list);
    }

    private static void addLeafs(TreeNode node, List<Integer> result){
        if(isLeaf(node)){
            result.add(node.val);
            return;
        }
        if(node.left != null) addLeafs(node.left, result);
        if(node.right != null) addLeafs(node.right, result);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1, new TreeNode(2, new TreeNode(11), new TreeNode(12)), new TreeNode(3, new TreeNode(4), new TreeNode(5)));
        ArrayList<Integer> result = new ArrayList<>();
        if(!isLeaf(root)) result.add(root.val);
        addLeftBoundary(root, result);
        addLeafs(root,result);
        addRightBoundary(root, result);

        System.out.println(result);
    }

}
