import java.util.ArrayList;
import java.util.List;

//java -cp out src/Recursion/RecursionFirstSubsequenceSum.java
public class RecursionFirstSubsequenceSum {
    public static void main(String[] args) {
        getFirstSubsequence(0, new ArrayList<>(), new int[]{2,1,2,1}, 2);
    }

    public static boolean getFirstSubsequence(int n, List<Integer> basket, int[] arr, int target){
        if(n >= arr.length){
            int sum = basket.stream().mapToInt(Integer::intValue).sum();
            if(sum == target){
                for(int i : basket){
                    System.out.print(i+" ");
                }
                return true;
            }
            return false;
        }
        basket.add(arr[n]);
        if(getFirstSubsequence(n+1, basket, arr, target)) return true;
        basket.remove(basket.size()-1);
        if(getFirstSubsequence(n+1, basket, arr, target)) return true;
        return false;
    }
}
