package org.example;

public class SumNumber {
    public static void main(String[] args) {
        System.out.println(sum(1342));
    }

    public static int sum(int n){
        if(n==0){
            return 0;
        }
        System.out.println(n/10);
        System.out.println(n%10);

        return sum(n/10)+n%10;
    }
}
