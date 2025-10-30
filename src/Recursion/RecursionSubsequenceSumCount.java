import java.util.ArrayList;
import java.util.List;

public class RecursionSubsequenceSumCount {
    public static void main(String[] args) {
        System.out.print("Subsequence count: "+getSubsequenceSumCount(0, new ArrayList<>(), new int[]{1,2,1}, 2));
    }

    public static int getSubsequenceSumCount(int n, List<Integer> basket, int[] arr, int target){
        if(n >= arr.length){
            int sum = basket.stream().mapToInt(Integer::intValue).sum();
            if(sum == target) return 1;
            return 0;
        }
        basket.add(arr[n]);
        int left = getSubsequenceSumCount(n+1, basket, arr, target);
        basket.remove(basket.size()-1);
        int right = getSubsequenceSumCount(n+1, basket, arr, target);
        return left+right;
    }
}
