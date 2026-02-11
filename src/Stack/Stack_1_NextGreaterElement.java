package Stack;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Stack_1_NextGreaterElement {
    public static void main(String[] args) {
        int[] nums1 = new int[]{4,1,2};
        int[] nums2 = new int[]{1,3,4,2};

        Arrays.stream(nextGreaterElement(nums1,nums2)).forEach(System.out::println);
    }

    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> stack = new Stack<>();
        Map<Integer, Integer> map = new HashMap<>();
        int[] res = new int[nums1.length];
        for(int i = nums2.length-1; i>=0; i--){
            while(!stack.isEmpty() && stack.peek()<=nums2[i]){
                stack.pop();
            }
            if(stack.isEmpty()) map.put(nums2[i], -1);
            else{
                map.put(nums2[i], stack.peek());
            }
            stack.push(nums2[i]);
        }

        for(int j = 0; j<nums1.length; j++){
            res[j] = map.get(nums1[j]);
        }
        return res;
    }
}
