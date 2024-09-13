package com.JAVA.bsinterviewquestions;

public class floor {

    public static void main(String[] args) {
        // Input array and target value
        int[] arr = {2, 3, 5, 9, 14, 16, 18};
        int target = 15;

        // Find the floor of the target in the array
        int ans = Floor(arr, target);

        // Output the result (index of the largest number <= target)
        System.out.println(ans);

        //ceiling is the smallest number >= target
    }

    /**
     * Function to find the index of the largest number <= target in the array.
     * If no such number exists, return -1.
     *
     * @param arr    Sorted array (either ascending or descending)
     * @param target Target number for which we need to find the floor
     * @return Index of the floor element, or -1 if it doesn't exist
     */
    static int Floor(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        // Check if the array is sorted in ascending or descending order.
        boolean isAsc = arr[start] < arr[end];

        // Binary search for the floor
        while (start <= end) {
            // Calculate the mid index, using a formula that avoids overflow.
            int mid = start + (end - start) / 2;

            // If the target is exactly at the mid, return the mid index.
            if (arr[mid] == target) {
                return mid;
            }

            // For ascending sorted array
            if (isAsc) {
                // If the target is smaller than the mid element, move to the left.
                if (target < arr[mid]) {
                    end = mid - 1;
                } else { // If the target is larger, move to the right.
                    start = mid + 1;
                }
            } else {
                // For descending sorted array
                // If the target is larger than the mid element, move to the left.
                if (target > arr[mid]) {
                    end = mid - 1;
                } else { // If the target is smaller, move to the right.
                    start = mid + 1;
                }
            }
        }

        // If the loop exits, `end` is the index of the largest number less than or equal to the target.
        return end;
    }
}
