package BinarySearch;

public class BS_2_SearchInsertPosition {


    public static void main(String[] args) {
        int[] nums = new int[]{1,3,5,6};
        int target = 2;
        System.out.println(getInsertPosition(nums, target));
    }

    public static int getInsertPosition(int[] nums, int target ){

        int left = 0;
        int right = nums.length-1;

        while(left<=right){
            int mid = left + (right-left)/2;
            if(nums[mid] == target) return mid;
            else if(target < nums[mid]) right = mid-1;
            else left = mid+1;
        }
        return left;
    }
}
