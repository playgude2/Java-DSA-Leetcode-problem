package org.example;

public class CountZeros {

    public static void main(String[] args) {
        System.out.println(countZeros(1020400,0));
        System.out.println(countZeros(124,0));

    }

    public static int countZeros(int x, int count){
        int rem = x%10;
        if(x == 0){
            return count;
        }
        if(rem == 0){
            return countZeros(x/10,count+1);

        }

            return countZeros(x/10,count);


    }
}
