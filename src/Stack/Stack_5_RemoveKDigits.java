package Stack;

import java.util.Stack;

public class Stack_5_RemoveKDigits {
    public static void main(String[] args) {
        String s = "1432219";
        int k = 3;
        System.out.println(removeKdigits(s, k));
    }

    public static String removeKdigits(String num, int k) {
        Stack<Character> stack = new Stack<>();
        StringBuilder res = new StringBuilder("");

        for(int i=0; i<num.length(); i++){
            while(!stack.isEmpty() && stack.peek()>num.charAt(i) && k!=0){
                stack.pop();
                k--;
            }
            if(stack.isEmpty() && num.charAt(i)=='0') continue;
            else stack.push(num.charAt(i));
        }

        if(stack.isEmpty()) return "0";
        else{
            while(!stack.isEmpty() && k>0){
                stack.pop();
                k--;
            }
            while(!stack.isEmpty()){
                res.append(stack.pop());
            }
            res.reverse();
            String finalRes = res.toString();
            return ((finalRes == "") ? "0" : finalRes);
        }


    }
}
