package com.bridge.algorithm;

public class MergeSort {
    public static void main(String[] args) {
        String[] arr={"Mango","Banana","Apple","Kiwi","Papaya"};
        String[] sortedArray = mSort(arr);
        for (int i = 0; i < sortedArray.length; i++) {
            System.out.println(sortedArray[i] + " ");
        }
    }
    public static String[] mSort(String[] arr) {
        String[] sorted=new String[arr.length];
        if(arr.length==1)
        {
            sorted=arr;
        }
        else {
            int mid= arr.length/2;
            String[] left=null;
            String[] right=null;
            if((arr.length%2)==0)
            {
                left=new String[arr.length/2];
                right=new String[arr.length/2];
            }
            else {
                left = new String[arr.length / 2];
                right = new String[(arr.length / 2) + 1];
            }
            int x = 0;
            int y = 0;
            for (; x < mid; x++) {
                left[x] = arr[x];
            }
            for (; x < arr.length; x++) {
                right[y++] = arr[x];
            }
            left = mSort(left);
            right = mSort(right);
            sorted = mergeArray(left, right);
        }

        return sorted;
    }

    private static String[] mergeArray(String[] left, String[] right) {
        String[] merged = new String[left.length + right.length];
        int lIndex = 0;
        int rIndex = 0;
        int mIndex = 0;
        int comp = 0;
        while (lIndex < left.length || rIndex < right.length) {
            if (lIndex == left.length) {
                merged[mIndex++] = right[rIndex++];
            } else if (rIndex == right.length) {
                merged[mIndex++] = left[lIndex++];
            } else {
                comp = left[lIndex].compareTo(right[rIndex]);
                if (comp > 0) {
                    merged[mIndex++] = right[rIndex++];
                } else if (comp < 0) {
                    merged[mIndex++] = left[lIndex++];
                } else {
                    merged[mIndex++] = left[lIndex++];
                }
            }
        }
        return merged;
    }
}


