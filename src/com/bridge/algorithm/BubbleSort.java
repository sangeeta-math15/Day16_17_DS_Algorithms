package com.bridge.algorithm;

public class BubbleSort {
    public static void main(String[] args) {
        BubbleSort sort=new BubbleSort();
        int arr[]={46,21,87,19,25,54,90};
        sort.bubbleSort(arr);
        System.out.println("Sorted array:");
        sort.printArray(arr);

    }

    void bubbleSort(int[] arr) {
        int n=arr.length;
        for(int i=0;i<n-1;i++)
            for(int j=0;j<n-i-1;j++)
                if(arr[j]>arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
    }
    void printArray(int arr[])
    {
        int n=arr.length;
        for (int i = 0; i<n; i++)
            System.out.println(arr[i] + " ");
        System.out.println();
    }
}
