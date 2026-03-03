package BinarySearch;

public class BS_1_Vanilla {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5,6,7,8};
        int t = 5;
        System.out.println(binarySearch(arr, t, 0, arr.length-1));
    }

    public static int binarySearch(int[] arr, int t, int left, int right){
        if(left==right) return t==arr[left] ? left : -1;
        int mid = left+(right-left)/2;
        if(t<=arr[mid]){
            return binarySearch(arr, t, left, mid);
        } else{
            return binarySearch(arr, t, mid+1, right);
        }
    }
}
