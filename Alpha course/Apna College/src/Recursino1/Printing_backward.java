package Recursino1;

public class Printing_backward {
    public static void print_Dec(int n)
    {
        if(n==1)
        {
            System.out.print(n + " ");
            return;
        }
        System.out.print(n+" ");
        print_Dec(n-1);
    }
    public static void main(String[] args) {
        int n = 10;
        print_Dec(n);
    }
}
