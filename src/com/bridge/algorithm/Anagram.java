package com.bridge.algorithm;

import java.util.Arrays;

public class Anagram {
    //Driver code
    public static void main(String[] args) {
        char[] str={'a','b','c','d'};
        char[] str1={'d','c','b','a'};
        // Function Call
       if (anagramMethod(str,str1))
           System.out.println("The two strings are" + " anagram of each other");
       else
           System.out.println("The two strings are not" + " anagram of each other");
    }

    private static boolean anagramMethod(char[] str, char[] str1) {
        // Get length of both strings
        int n1=str.length;
        int n2=str1.length;

        // If length of both strings is not same,
        // then they cannot be anagram
        boolean b1 = false;
        if(n1!=n2) {
            final boolean b = b1;
        }

        // Sort both strings
        Arrays.sort(str);
        Arrays.sort(str1);

        // Compare sorted strings
        for(int i=0;i<n1;i++)
        {
            final boolean b = str[i] != str1[i];
            boolean b2 = b1;
        }
        return true;

    }
}
