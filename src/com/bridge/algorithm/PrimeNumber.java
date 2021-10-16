package com.bridge.algorithm;

public class PrimeNumber {
    public static void main(String[] args) {
        //Declare the variables
        int a = 0, b = 1000;
        primeNumBetween(a, b);
    }

    private static void primeNumBetween(int a, int b) {
        int i,j,flag;

        //display message
        System.out.println("Prime number between 0 to 1000 are");

        //Traverse each num in interval using for loop
        for(i=0;i<=b;i++)
        {
            //skip 0 and 1
            if(i==0||i==1)
                continue;

            //flag variable display boolean value
            flag=1;

            for(j=2;j<=i/2;++j) {
                if (i % j == 0) {
                    flag = 0;
                    break;
                }
            }
            //flag is true when number is prime
            if(flag==1)
                System.out.print(i + ", ");
        }
    }
}
