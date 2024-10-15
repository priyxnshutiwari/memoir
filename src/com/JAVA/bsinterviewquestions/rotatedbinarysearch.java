package com.JAVA.bsinterviewquestions;
/*
pivot is the largest number in the array, also from which your next nos are asc
every rotated array will follow this form (ascending/pivot/ascending)
steps:
1)find pivot case a) [when mid>mid+1 ( or the desc part then mid is pivot)
  case b) or when mid < mid -1 element then mid -1 element is pivot]
  case c) start >= mid then all the elements after mid will be smaller than start hence ignore them since were looking for the largest element, ignore by coding end = mid - 1
  case d) start < mid means bigger nos lie ahead of mid so code start = mid + 1
2)search in first half(0 to pivot) by applying BS
3)otherwise search in second half(pivot+1 till end)

*/

public class rotatedbinarysearch {
    public static void main(String[] args) {
        int[] nums = {4,5,6,7,0,1,2};
        System.out.println(findPivot(nums));
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
        }
        return -1;
    }
}
