package com.JAVA.bsinterviewquestions;
// https://www.geeksforgeeks.org/find-position-element-sorted-array-infinite-numbers/
// The program solves the problem of finding an element in an "infinite" sorted array.
// Since the array is "infinite", we do not know the length, so we keep increasing the size of the search range dynamically.
        public class InfiniteArray {
            public static void main(String[] args) {
                // A sorted array to simulate the infinite array problem
                int[] arr = {3, 5, 7, 9, 10, 90, 100, 130, 140, 160, 170};
                int target = 10;  // The target element we want to find
                System.out.println(ans(arr, target));  // Output the result
            }

            // Function to find the position of the target element
            static int ans(int[] arr, int target) {
                // Start with an initial range of size 2 (start from index 0 to index 1)
                int start = 0;
                int end = 1;

                // Expand the search range until the target is within the range
                while (target > arr[end]) {
                    int temp = end + 1;  // Set the new start to the index just after the current end
                    // Double the search range size
                    // end = previous end + (size of the current box) * 2
                    end = end + (end - start + 1) * 2;
                    start = temp;  // Update the start to the new value
                }

                // Once the target is within the range, use binary search to find its position
                return binarySearch(arr, target, start, end);
            }

            // A standard binary search algorithm to find the target element within a given range
            static int binarySearch(int[] arr, int target, int start, int end) {
                while (start <= end) {
                    // Calculate the middle element in the range.
                    // Using (start + end) / 2 might cause overflow for large values,
                    // so we use start + (end - start) / 2 instead.
                    int mid = start + (end - start) / 2;

                    // If the target is smaller than the middle element, narrow the search to the left half
                    if (target < arr[mid]) {
                        end = mid - 1;
                    }
                    // If the target is larger than the middle element, narrow the search to the right half
                    else if (target > arr[mid]) {
                        start = mid + 1;
                    }
                    // If the middle element is the target, return the index
                    else {
                        return mid;  // Target found
                    }
                }

                // If the target is not found, return -1
                return -1;
            }
        }


