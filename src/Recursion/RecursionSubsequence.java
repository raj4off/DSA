package Recursion;

import java.util.ArrayList;
import java.util.List;

// tick and non-tick
public class RecursionSubsequence {
 
    public static void main(String[] args) {
        printSubSeq(0, new ArrayList<>(), new int[]{2,3,1,2});
    }

    public static void printSubSeq(int n, List<Integer> basket, int[] arr){
        if(n >= arr.length){
            if(basket.size() == 0) System.out.println("{}");
            else {
                for(int i: basket){
                    System.out.print(i+ " ");
                }
                System.out.println();
            }
            return;
        }
        //printSubSeq(n+1, basket, arr);  //reverse order
        basket.add(arr[n]);
        printSubSeq(n+1, basket, arr);
        basket.remove(basket.size()-1);
        printSubSeq(n+1, basket, arr);
    }
    
}
