package org.example;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(121));  // Output: true
        System.out.println(isPalindrome(-121)); // Output: false
        System.out.println(isPalindrome(10));   // Output: false    }
    }
    public static boolean isPalindrome(int x){
        if(x<0){
            return false;
        }
        return checkPalindrome(x,x,0);
    }

    public static boolean checkPalindrome(int org,int x,int rev){
        if(x==0){
            return org == rev;
        }
        return checkPalindrome(org,x/10,rev*10+x%10);
    }
}
