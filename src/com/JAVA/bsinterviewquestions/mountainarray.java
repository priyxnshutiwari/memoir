package com.JAVA.bsinterviewquestions;

public class mountainarray {
    public static void main(String[] args) {

        int[] arr = {0,10,5,2};
        int ans = peakindex(arr);
        System.out.println(ans);
    }

    public static int peakindex(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) {
                //you are in the dec part of the array
                //this may be the ans but look to the left
                end = mid; //this why end!=mid-1
            } else {
                //you are in asc part of the array
                start = mid + 1; //since mid+1 element > mid element
            }
        }
        /*
        in the end, start == end and pointing to the largest number because of the 2 checks above
        start and end are always trying to find the maximum element in the above 2 checks
        hence, when they are pointing to one element, that is the maximum one bcoz that is what the checks sat
        more elaboration: at every point of time for start and end, they have the best possible ans till that time
        and if we are saying that only one item is remaining, hence because of the above line, that is the best possible ans
        */
        return start; // or return end since both are equal
    }
}