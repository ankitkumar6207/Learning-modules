package Recursino1;

import java.sql.SQLOutput;

public class Printing_forward {
    public static void printInc(int n)
    {
        if(n == 1)
        {
            System.out.print(n+" ");
            return;
        }
        printInc(n-1);
        System.out.print(n+" ");
    }
    public static void main(String[] args) {
        int n = 10;
        printInc(n);

    }
}