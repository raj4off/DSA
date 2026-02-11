package Arrays;

//java -cp out src/Arrays/Arrays_1_RemoveDuplicateSorted.java
public class Arrays_1_RemoveDuplicateSorted {
    public static void main(String[] args) {
        int[] arr = new int[]{1,1,1,2,2,2,3,3,3};
        int i = 1;
        for(int j = 1; j<arr.length; j++){
            if(arr[i-1]!=arr[j]){
                arr[i] = arr[j];
                i++;
            }
        }
        while(i<arr.length){
            arr[i++] = 0;
        }
        for(int k: arr){
            System.out.println(k);
        }
    }
}
