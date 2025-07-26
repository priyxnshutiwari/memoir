package com.JAVA.recursion;

public class thirdBS {
    public static void main(String[] args) {
        int[] arr = {1,3,5,7,9};
        int target = 9;
        System.out.println(BSsearch(arr,target,0,arr.length-1));
    }
    static int BSsearch(int[] arr,int target,int s, int e) {
        if (s>e) {
            return -1;
        }
        int m = s + (e-s)/2;
        if (arr[m]==target) {
            return m;
        }
        if (arr[m]>target) {
            return BSsearch(arr,target,s,m-1);
        }
        return BSsearch(arr,target,m+1,e);
    }
}
