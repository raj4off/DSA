package Stack;

import java.util.Arrays;
import java.util.Stack;

public class Stack_3_SumSubArrMins {

    public static void main(String[] args) {
//        int[] arr = new int[]{1,4,6,7,3,7,8,1};
        int[] arr = new int[]{11,81,94,43,3};
        System.out.println(findSubArrMinSum(arr));
    }

    public static int findSubArrMinSum(int[] arr){
        int[] prevSmall = findPrevSmallestNumber(arr);
        int[] nextSmall = findNextSmallestNumber(arr);
        long total = 0;
        int mod =  (int) 1e9+7;//1000000007;

        for(int i = 0; i<arr.length; i++){
            int left = i-prevSmall[i];
            int right = nextSmall[i]-i;
            total = (total+(left*right*1l*arr[i])%mod)%mod;
        }
        return (int)total;
    }

    public static int[] findPrevSmallestNumber(int[] arr){
        Stack<Integer> stack = new Stack<>();
        int[] res = new int[arr.length];
        for(int i = 0; i<arr.length; i++){
            while(!stack.isEmpty() && arr[stack.peek()]>arr[i]){
                stack.pop();
            }
            res[i] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(i);
        }
        return res;
    }

    public static int[] findNextSmallestNumber(int[] arr){
        Stack<Integer> stack = new Stack<>();
        int[] res = new int[arr.length];
        for(int i = arr.length-1; i>=0; i--){
            while(!stack.isEmpty() && arr[stack.peek()]>=arr[i]){
                stack.pop();
            }
            res[i] = stack.isEmpty() ? arr.length : stack.peek();
            stack.push(i);
        }
        return res;
    }


}
