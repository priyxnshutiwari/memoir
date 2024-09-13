package com.JAVA.bsinterviewquestions;

public class BSformat {

        public static void main(String[] args) {
            // Create a sorted array of integers
            int[] arr = {-18, -12, -4, 0, 2, 3, 4, 15, 16, 18, 22, 45, 89};

            // Define the target value we are searching for
            int target = 22;

            // Call the binarySearch method with the array and target value, store the result in 'ans'
            int ans = binarySearch(arr, target);

            // Print the result, which is the index of the target in the array, or -1 if not found
            System.out.println(ans);
        }

        /**
         * Perform binary search on a sorted array to find the index of the target value.
         *
         * @param arr The sorted array of integers
         * @param target The target value to search for
         * @return The index of the target in the array, or -1 if the target is not found
         */
        static int binarySearch(int[] arr, int target) {
            // Initialize the starting point of the search range (first index of the array)
            int start = 0;

            // Initialize the ending point of the search range (last index of the array)
            int end = arr.length - 1;

            // Continue searching as long as start is less than or equal to end
            while(start <= end) {
                // Find the middle index to compare with the target
                // Avoid overflow by using the formula (start + (end - start) / 2) instead of (start + end) / 2
                int mid = start + (end - start) / 2;

                // Check if the target is less than the middle element
                if (target < arr[mid]) {
                    // If target is smaller, discard the right half by updating the end index
                    end = mid - 1;
                }
                // Check if the target is greater than the middle element
                else if (target > arr[mid]) {
                    // If target is larger, discard the left half by updating the start index
                    start = mid + 1;
                }
                // If the middle element is equal to the target
                else {
                    // Return the index of the target (i.e., the middle index)
                    return mid;
                }
            }

            // If the loop finishes and the target is not found, return -1
            return -1;
        }
    }
