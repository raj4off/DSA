package Recursion;

import java.util.ArrayList;
import java.util.List;

public class RecursionSubsequenceSum {
    public static void main(String[] args) {
        printSubsequenceSum(0, 2, new ArrayList<>(), new int[]{1,2,1});
    }

    public static void printSubsequenceSum(int i, int target, List<Integer> basket, int[] arr){
        if(i >= arr.length){
            int sum = 0;
            for (int v : basket) sum += v;
            if(sum == target){
                if(basket.isEmpty()){
                    System.out.println("{}");
                } else {
                    for(int item: basket){
                        System.out.print(item+" ");
                    }
                    System.out.println();
                }
            }
            return;
        }
        basket.add(arr[i]);
        printSubsequenceSum(i+1, target, basket, arr);
        basket.remove(basket.size()-1);
        printSubsequenceSum(i+1, target, basket, arr);
    }
}
