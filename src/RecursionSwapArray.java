public class RecursionSwapArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        swapArray(arr, 0, arr.length-1);
        for(int i: arr){
            System.out.print(i + " ");
        }
    }

    public static void swapArray(int[] arr, int i, int j){
        if(i==j) return;
        swap(arr, i, j);
        swapArray(arr, i+1, j-1);
    }

    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
