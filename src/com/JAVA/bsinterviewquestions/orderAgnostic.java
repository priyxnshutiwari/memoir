package com.JAVA.bsinterviewquestions;

public class orderAgnostic {
    public static void main(String[] args) {
        int[] arr = {99,80,75,22,11,10,5,2,-3};
        int target = 22;
        int ans = orderAgnosticBS(arr,target);
        System.out.println(ans);
    }

    static int orderAgnosticBS(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        //boolean isAsc;
        //        if (arr[start] < arr[end]) isAsc = true;
        //        else isAsc = false; (below is the compact form)
        // isAsc give answer either true or false
        boolean isAsc = arr[start] < arr[end];

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }
            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
            else {
                if (target > arr[mid]) { //notice the change of signs in this line
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
            return -1;
        }
}