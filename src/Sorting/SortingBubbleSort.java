package Sorting;

public class SortingBubbleSort {
    /*
     * Push the max to the last by adjacent swaps.
     * Time complexity (worst & average: O(n^2) | best: O(n))
    */

    public static void main(String[] args) {
        int[] arr = new int[]{18,4,15,2,44,1};
        for(int n=arr.length-1; n>0; n--){
            boolean isSwapDone = false;
            for(int i = 0; i<n; i++){
                if(arr[i] > arr[i+1]){
                    swap(arr, i, i+1);
                    isSwapDone = true;
                }
            }
            if(!isSwapDone) break;
        }
        for(int i : arr){
            System.out.print(i+" ");
        }
    }

    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
