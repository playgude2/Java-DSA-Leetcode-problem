package org.example;

public class NumericTable {

    public static void main(String[] args) {
        table1(2, 1);
    }

    public static void table1(int n, int multiplier) {
        if (multiplier > 10) {
            return;
        }
        System.out.println(n + " x " + multiplier + " = " + (n * multiplier));

        table1(n, multiplier + 1);

    }
}

