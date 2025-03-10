package org.example.RecursionProblem;

public class Stairs {
    public static void main(String[] args) {
        System.out.println(climbStairs(5));
    }


    public static int climbStairs(int n) {
        if (n <= 2) return n;

        int first = 1, second = 2;
        for (int i = 3; i <= n; i++) {
            int third = first + second;
            first = second;
            second = third;
        }
        return second;
    }

}