package com.yin.二分查找;

public class 二分查找 {
    public int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        int mid;
        while (low <= high) {
            mid = (low + high) / 2;
            if(target == nums[mid]) {
                return mid;
            }
            if(target > nums[mid]) {
                low = mid + 1;
            }else{
                high = mid - 1;
            }
        }
        return -1;
    }
}
