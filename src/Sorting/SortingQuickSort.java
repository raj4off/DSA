package Sorting;

public class SortingQuickSort {
    /*
     * Ascending order/ Descending order.
     * Pick a pivot and place it in correct position in sorted array.
     * After placing the pivot all smaller are in left and all larger are in right.
     */

    public static void main(String[] args) {
        int[] arr = new int[]{5,3,6,7,8};
        quickSort(arr, 0, arr.length-1);
        for(int i: arr){
            System.out.print(i+" ");
        }
    }

    public static void quickSort(int[] arr, int low, int high){
        if(low >= high) return;
        int i = low;
        int j = high;
        int pivot = arr[low];
        while(i < j){
            while(arr[i] < pivot && i < high){
                i++;
            }
            while(arr[j] > pivot && j > low){
                j--;
            }
            if(i<j) swap(arr, i, j);
        }
        swap(arr, low, j);
        quickSort(arr, low, j-1);
        quickSort(arr, j+1, high);
    }

    public static void swap(int[] arr, int x, int y){
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }
}
