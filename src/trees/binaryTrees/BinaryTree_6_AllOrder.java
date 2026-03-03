package trees.binaryTrees;

import java.util.*;

public class BinaryTree_6_AllOrder {

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

        TreeNode root = new TreeNode(1, new TreeNode(2), new TreeNode(3, new TreeNode(4), new TreeNode(5)));

        List<Integer> preorder = new ArrayList<>();
        List<Integer> inorder =  new ArrayList<>();
        List<Integer> postorder = new ArrayList<>();
        Stack<Pair> st = new Stack<>();


        st.push(new Pair(root, 1));
        while(!st.isEmpty()){
            Pair it = st.pop();

            if(it.num == 1){
                preorder.add(it.node.val);
                it.num++;
                st.push(it);
                if(it.node.left != null) st.push(new Pair(it.node.left, 1));
            } else if(it.num == 2){
                inorder.add(it.node.val);
                it.num++;
                st.push(it);
                if(it.node.right != null) st.push(new Pair(it.node.right, 1));
            } else{
                postorder.add(it.node.val);
            }
        }

        System.out.println("Preorder: "+preorder);
        System.out.println("Inorder: "+inorder);
        System.out.println("Postorder: "+postorder);
    }

}
