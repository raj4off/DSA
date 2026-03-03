package trees.binaryTrees;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BinaryTree_5_PreOrderIterative {

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
        int num;

        public Pair(TreeNode node, int num){
            this.node = node;
            this.num = num;
        }
    }

    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(1, new TreeNode(2), new TreeNode(3, new TreeNode(4), new TreeNode(5)));
        List<Integer> result = postOrder(treeNode);

        result.forEach(x -> System.out.print(x+" "));
    }

    private static List<Integer> preorder(TreeNode node){
        List<Integer> result = new ArrayList<>();
        if(node == null) return result;

        Stack<TreeNode> stack = new Stack<>();
        stack.push(node);

        while(!stack.isEmpty()){
            node = stack.pop();
            result.add(node.val);
            if(node.right != null) stack.push(node.right);
            if(node.left != null) stack.push(node.left);
        }
        return result;
    }

    private static List<Integer> inorder(TreeNode node){
        List<Integer> result = new ArrayList<>();
        if(node == null) return result;

        Stack<TreeNode> stack = new Stack<>();
        while(true){
            if(node != null){
                stack.push(node);
                node = node.left;
            } else{
                if(stack.isEmpty()) break;
                node = stack.pop();
                result.add(node.val);
                node = node.right;
            }
        }
        return result;
    }

    private static List<Integer> postOrder(TreeNode node){
        List<Integer> result = new ArrayList<>();
        Stack<TreeNode> st1 = new Stack<>();
        Stack<TreeNode> st2 = new Stack<>();

        if(node == null) return result;

        st1.push(node);
        while(!st1.isEmpty()){
            node = st1.pop();
            st2.push(node);
            if(node.left != null) st1.push(node.left);
            if(node.right != null) st1.push(node.right);
        }
        while(!st2.isEmpty()){
            result.add(st2.pop().val);
        }

        return result;
    }
}
