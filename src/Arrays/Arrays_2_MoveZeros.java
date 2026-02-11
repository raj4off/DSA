package Arrays;

//java -cp out src/Arrays/Arrays_2_MoveZeros.java
public class Arrays_2_MoveZeros {
    public static void main(String[] args) {
        int[] arr = new int[]{0,1,0,3,12};
        int left = 0;
        for(int right = 0; right<arr.length; right++){
            if(arr[right] != 0){
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
            }
        }

        for(int i : arr){
            System.out.print(i+ " ");
        }
    }
}
