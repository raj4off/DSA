package Sorting;

// java -cp out src/Sorting/SortingInsertionSort.java
public class SortingInsertionSort {
    public static void main(String[] args) {
        /*
         * Take the element place it in its correct position.
         * time - Worst & Average: O(n^2) | Best: O(n)
        */
        int arr[] = new int[]{5,14,3,52,1};

        for(int i = 0; i<arr.length; i++){
            int j = i;
            while(j>0 && arr[j-1]>arr[j]){
                int temp = arr[j-1];
                arr[j-1] = arr[j];
                arr[j] = temp;
                j--;
            }
        }

        for(int i: arr){
            System.out.print(i+ " ");
        }
    }
}
