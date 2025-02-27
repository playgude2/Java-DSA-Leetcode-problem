package org.example;

public class ReverseNumber {
    public static void main(String[] args) {
        reverse(3241);
        System.out.println(sum);
    }

    static int sum = 0;
    static void reverse(int n){
        System.out.println("n"+n);

        if(n==0){
            return;
        }
        int rem = n%10;
        sum = sum*10 + rem;
        System.out.println("sum"+sum);
        reverse(n/10);
    }
}
