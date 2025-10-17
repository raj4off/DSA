public class RecursionSwapArrayWithoutSecondVar {
    
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        swapArray(arr, 0);
        for(int i: arr){
            System.out.print(i + " ");
        }
    }

    public static void swapArray(int[] arr, int i){
        int n = arr.length;
        if(i >= n/2) return;
        swap(arr, i, n-i-1);
        swapArray(arr, i+1);
    }

    public static void swap(int[] arr, int i, int j){
        arr[i] = arr[i] + arr[j];
        arr[j] = arr[i] - arr[j];
        arr[i] = arr[i] - arr[j];
    }
}
