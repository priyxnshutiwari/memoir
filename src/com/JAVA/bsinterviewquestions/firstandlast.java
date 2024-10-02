package com.JAVA.bsinterviewquestions;

import java.util.Arrays;

public class firstandlast {
    public static void main(String[] args) {
        // Test case: call searchRange from main, now it's a static method
        int[] result = searchRange(new int[]{5, 7, 7, 8, 8, 10}, 8);
        System.out.println(Arrays.toString(result));  // Output: [3, 4]
    }

    // Make the searchRange method static so it can be called from main
    public static int[] searchRange(int[] nums, int target) {
        int[] ans = {-1,-1};
        //check for first occurrence if target first
        int start = search(nums,target, true);
        int end = search(nums,target,false);

        ans[0]=start;
        ans[1]=end;

        return ans;
    }

    // Make search method static, so it can be called within searchRange
    public static int search(int[] nums, int target, boolean findStartIndex) {
        int ans = -1;
        // Initialize the starting point of the search range (first index of the array)
        int start = 0;

        // Initialize the ending point of the search range (last index of the array)
        int end = nums.length - 1;

        // Continue searching as long as start is less than or equal to end
        while(start <= end) {
            // Find the middle index to compare with the target
            // Avoid overflow by using the formula (start + (end - start) / 2) instead of (start + end) / 2
            int mid = start + (end - start) / 2;

            // Check if the target is less than the middle element
            if (target < nums[mid]) {
                // If target is smaller, discard the right half by updating the end index
                end = mid - 1;
            }
            // Check if the target is greater than the middle element
            else if (target > nums[mid]) {
                // If target is larger, discard the left half by updating the start index
                start = mid + 1;
            }
            // If the middle element is equal to the target
            else {
                // potential ans is found
                ans = mid;
                if (findStartIndex == true) {
                    end = mid -1 ;
                }
                else {
                    start = mid + 1;
                }
            }
        }

        // If the loop finishes and the target is not found, return -1
        return ans;
    }
}
