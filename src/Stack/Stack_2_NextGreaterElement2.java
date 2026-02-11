package Stack;

import java.util.Arrays;
import java.util.Stack;

public class Stack_2_NextGreaterElement2 {
    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3,4,3};
        Arrays.stream(nextGreaterElements(nums)).forEach(System.out::println);
    }

    public static int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        Stack<Integer> stack = new Stack<>();

        for(int i = (2*n)-1; i>=0; i--){
            while(!stack.isEmpty() && stack.peek()<=nums[i%n]){
                stack.pop();
            }
            if(i<n){
                result[i] = stack.isEmpty() ? -1 : stack.peek();
            }
            stack.push(nums[i%n]);
        }
        return result;
    }
}
