package com.JAVA.bsinterviewquestions;

public class smallestletter {
    public static void main(String[] args) {
        String[] arr = {"c", "f", "j"};
        String target = "f";
        String ans = sm(arr, target);
        System.out.println(ans);
    }

    static String sm(String[] arr, String target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            // Compare target with arr[mid] using String's compareTo method
            if (target.compareTo(arr[mid]) < 0) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        // Return the smallest letter greater than the target, wrapping around if necessary
        return arr[start % arr.length];
    }
}
