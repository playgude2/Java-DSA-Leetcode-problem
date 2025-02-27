package org.example;

public class FibonacciNumber {
    public static void main(String[] args) {
        // find fibonaci number : 5

        fiboSeq(6);
    }

    public static void fiboSeq(int n){
        for(int i=0; i<=n;i++){
            System.out.println(fibo(i));
        }
    }
    public static int fibo(int n){
        if(n<2){
            return n;
        }
        return fibo(n-1) + fibo(n-2);
    }
}
