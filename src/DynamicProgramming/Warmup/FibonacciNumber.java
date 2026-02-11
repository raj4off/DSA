package DynamicProgramming.Warmup;

import java.util.Arrays;

public class FibonacciNumber {

    static long[] arr;

    public static void main(String[] args) {
        int n = 100;
        arr = new long[n+1];
        Arrays.fill(arr, -1);
        //System.out.println(getFibonacci(n));
        System.out.println(getFibonacciTab(n));
    }

    // S: O(N) | T: O(N)
    // recursive approach
    public static long getFibonacci(int x){
        if(x < 1) return 0;
        else if(x == 1) return 1;
        arr[x] = (arr[x] == -1) ? getFibonacci(x-1)+getFibonacci(x-2) : arr[x];   // top-down approach (to the base case and come up)
        return arr[x];
    }

    // S: O(N) | T: O(N)
    // tabulation approach
    public static long getFibonacciTab(int x){
        arr[0] = 0; arr[1] = 1;    // bottom-up approach  (start from base case)
        for(int i = 2; i<=x; i++) arr[i] = arr[i-1]+arr[i-2];
        return arr[x];
    }
}
