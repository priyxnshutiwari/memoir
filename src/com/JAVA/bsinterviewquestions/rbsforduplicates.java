package com.JAVA.bsinterviewquestions;

public class rbsforduplicates {
    public static void main(String[] args) {
        int[] nums = {4,5,6,7,0,1,2};
        int target = 0;
        int result = search(nums, target);
        System.out.println(result);
    }

    static int search(int[] nums, int target) {
        int pivot = findPivot(nums);
        //if you didn't found a pivot, that means that the array is not rotated
        if (pivot == -1) {
            //just do normal binary search
            return binarySearch(nums,target,0, nums.length-1);
        }
        //if pivot is found, you have found 2 asc sorted arrays
        /*
        case 1) pivot = target
        case 2) target > start -> search space (s,p-1) since all nos are < start
        case 3) target < start -> we know that all the els from start till pivot are > target -> search space (p+1,e)
         */
        //this will not work for duplicate values
        if (nums[pivot] == target) {
            return pivot;
        }
        if (target>= nums[0]) {
            return binarySearch(nums,target,0, pivot-1);
        }
        return binarySearch(nums,target,pivot+1, nums.length-1);
    }
    static int binarySearch(int[] arr, int target, int start, int end) {
        while(start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            }
            else if (target > arr[mid]) {
                start = mid + 1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }

    static int findPivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start<=end) {
            int mid = start + (end - start)/2;
            //4 cases over here
            if (mid < end && arr[mid] > arr[mid + 1]) {
                //mid<end since we dont want mid+1 out of the bounds as it will throw error
                //and (&) means all the value should be true to work
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid + 1]) {
                return mid - 1;
            }
            if (arr[mid] <= arr[start]) {
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
            //if el at middle,start and end, just skip the duplicates
            if (arr[mid]==arr[start] && arr[mid]==arr[end]) {
                //skip the duplicates
                //note: what if these els are the pivot??
                //check if start is pivot
                if (arr[start] > arr[start+1]) {
                    return start;
                }
                start++;
                //check whether end is pivot
                if (arr[end] < arr[end-1]) {
                    return end - 1;
                }
                end--;
            }
            //left side is sorted, so pivot should be in the right
            else if (arr[start]==arr[mid] || (arr[start]==arr[mid] && arr[mid]>arr[end])) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}
