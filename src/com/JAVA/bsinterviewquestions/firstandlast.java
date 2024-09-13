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
        // Initialize the result array with {-1, -1} to indicate "not found"
        int[] ans = {-1, -1};

        // Find the first occurrence of the target
        ans[0] = search(nums, target, true);

        // If the first occurrence is found, find the last occurrence
        if (ans[0] != -1) {
            ans[1] = search(nums, target, false);
        }

        // Return the array with first and last positions (or {-1, -1} if not found)
        return ans;
    }

    // Make search method static so it can be called within searchRange
    public static int search(int[] nums, int target, boolean findStartIndex) {
        int ans = -1; // Initialize the answer to -1, meaning target not found
        int start = 0; // Start of the search range
        int end = nums.length - 1; // End of the search range

        // Perform binary search
        while (start <= end) {
            // Calculate the middle index to avoid overflow (safer than (start + end) / 2)
            int mid = start + (end - start) / 2;

            // If the target is smaller than the middle element, search in the left half
            if (target < nums[mid]) {
                end = mid - 1;
            }
            // If the target is larger than the middle element, search in the right half
            else if (target > nums[mid]) {
                start = mid + 1;
            }
            // If the target is equal to the middle element, we found a potential answer
            else {
                ans = mid; // Store the current index as a potential answer

                // If we are looking for the first occurrence, search on the left side of 'mid'
                if (findStartIndex) {
                    end = mid - 1;
                }
                // If we are looking for the last occurrence, search on the right side of 'mid'
                else {
                    start = mid + 1;
                }
            }
        }

        // Return the index of the target (or -1 if not found)
        return ans;
    }
}
