package Sorting;

public class SortingSelectionSort {
    /*
     * select minimum
     * swap the minimum to first
     * After i steps -> first n[0:i] elements are sorted.
     * Time complexity - O(n^2) {best, average, worst}
    */
    public static void main(String[] args) {
        int[] arr = new int[]{9, 4, 13, 1, 100};
        
        for(int i = 0; i < arr.length-1; i++){
            int min = i;
            for(int j = i; j < arr.length; j++){
                min = arr[j] < arr[min] ? j : min;
            }
            swap(arr, i, min);
        }

        for(int i : arr){
            System.out.print(i+" ");
        }
    }

    public static void swap(int[] arr, int i, int j){
        if(i == j) return;
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    

}
