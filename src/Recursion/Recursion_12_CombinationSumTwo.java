package Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// pick subsequence patterns.
public class Recursion_12_CombinationSumTwo {
    public static void main(String[] args) {
        int[] arr = new int[]{10,1,2,7,6,1,5};
        int target = 8;
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(arr);
        getCombinations(0, target, arr, new ArrayList<>(), result);
        System.out.println(result);

        // 1,1,2,2,3,6

        //1,1,6
        //1,2,5
        //1,7
        //2,6
    }

    public static void getCombinations(int index, int target, int[] arr, List<Integer> bucket, List<List<Integer>> result){
        if(target == 0) {
            result.add(new ArrayList<>(bucket));
            return;
        }
        for(int i = index; i<arr.length; i++){
            if(arr[index] > target) return;
            if(i > index  && arr[i] == arr[i-1]) continue;
            bucket.add(arr[i]);
            getCombinations(i+1, target-arr[i], arr, bucket, result);
            bucket.removeLast();
        }
    }
}
