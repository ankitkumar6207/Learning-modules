package Strings;

public class Palindrome {
    public static boolean checkPalindrome(String str)
    {
        int n= str.length();
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)!=str.charAt(n-1-i)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        boolean result =checkPalindrome("racecar");
        System.out.println(result);

    }
}
