package Recursion;

import java.util.ArrayList;
import java.util.List;

// pick not-pick pattern
public class Recursion_11_CombinationSum {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,7};
        int target = 7;
        List<List<Integer>> result = new ArrayList<>();
        getCombinations(0, target, arr, new ArrayList<>(), result);
        System.out.println(result);
    }

    public static void getCombinations(int index, int target, int[] arr, List<Integer> bucket, List<List<Integer>> result){
        if(index == arr.length){
            if(target == 0){
                result.add(new ArrayList<>(bucket));
            }
            return;
        }
        if(arr[index] <= target){
            bucket.add(arr[index]);
            getCombinations(index, target-arr[index], arr, bucket, result);
            bucket.removeLast();
        }
        getCombinations(index+1, target, arr, bucket, result);
    }
}
