package org.example;

public class LeapYear {
    public static void main(String[] args) {
        System.out.println(years(2008));
    }

    public static String years(int n){
        int leap = n%2;
        if(leap == 0){
           return "Leap";
        }
        else{
           return "not a Leap";
        }
    }
}
