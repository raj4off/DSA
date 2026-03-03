package BinarySearch;

import java.util.ArrayList;
import java.util.Arrays;

public class BS_3_FirstLastOccurrence {
    public static void main(String[] args) {
        int[] nums = new int[]{5,7,7,8,8,10};
        int target = 8;
        int[] res = searchRange(nums, target);
        System.out.println(Arrays.stream(res).boxed().toList());
    }

    public static int[] searchRange(int[] nums, int target) {
        int first = findFirstOccurrence(nums, target);
        if(first == -1) return new int[]{-1,-1};
        int last = findLastOccurrence(nums, target);
        return new int[]{first,last};
    }

    private static int findFirstOccurrence(int[] nums, int target){
        int left = 0;
        int right = nums.length-1;
        int first = -1;
        while(left<=right){
            int mid = left + (right - left)/2;
            if(nums[mid] ==  target){
                first = mid;
                right = mid-1;
            }else if(target<nums[mid]) right = mid-1;
            else left = mid + 1;
        }
        return first;
    }

    private static int findLastOccurrence(int[] nums, int target){
        int left = 0;
        int right = nums.length-1;
        int last = -1;
        while(left<=right){
            int mid = left + (right-left)/2;
            if(nums[mid]==target){
                last = mid;
                left = mid+1;
            }
            else if(target<nums[mid]) right = mid-1;
            else left = mid + 1;
        }
        return last;
    }
}
