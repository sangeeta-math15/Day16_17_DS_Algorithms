package com.bridge.algorithm;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        String[] arr={"Sangeeta","Subha","Raju","Chandru"};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        String x="Subha";
        int res=binarySearch(arr,x);

        if(res==-1)
            System.out.println("Elements not present");
        else
            System.out.println("Elements found at " + " index =>" + res);
    }

    static int binarySearch(String[] arr, String x) {
        int l=0,r=arr.length-1;
        while (l<=r)
        {
            int m=l+(r-1)/2;
            int res=x.compareTo(arr[m]);
            if(res==0)
                return m;
            if(res>0)
                l=m+1;
            else
                r=m-1;
        }
        return -1;
    }
}
