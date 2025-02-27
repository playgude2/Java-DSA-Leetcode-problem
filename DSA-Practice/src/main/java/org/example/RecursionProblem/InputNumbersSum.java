package org.example;

import java.util.Scanner;

public class InputNumbersSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers (type 'x' to stop):");

        int totalSum = sum(sc);  // Call the recursive function
        System.out.println("Total Sum: " + totalSum);

        sc.close(); // Close the scanner
    }

    public static int sum(Scanner sc){
        String input = sc.next(); // Read input as a string

        if(input.equals("x")){
            return 0;
        }
        int num =Integer.parseInt(input);
        return num+sum(sc);
    }
}
