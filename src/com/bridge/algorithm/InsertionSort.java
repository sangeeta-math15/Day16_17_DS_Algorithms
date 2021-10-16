package com.bridge.algorithm;

public class InsertionSort {
    public static void main(String[] args) {
        String[] arr={"you","are","looking","good"};
        int n=arr.length;
        String sortedArray[]=sort(arr,n);
        for(int i=0;i<sortedArray.length;i++)
            System.out.println("Sorted Array=>" +arr[i]);
    }

    private static String[] sort(String[] arr, int n) {
        String temp=" ";
        for(int i=0;i<n;i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i].compareToIgnoreCase(arr[j]) > 0) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
}
