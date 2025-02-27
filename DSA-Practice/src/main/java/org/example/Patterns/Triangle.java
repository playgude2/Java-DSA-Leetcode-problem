package org.example.Patterns;

import java.util.ArrayList;
import java.util.Arrays;

public class Triangle {
    public static void main(String[] args) {
        reverseTriangle(4,0);
        normalTriangle(4,0);
        int[] arr = {4,5,3,2,1};
        bubbleSort(arr, arr.length-1,0);
        System.out.println(Arrays.toString(arr));
        selectionSort(arr,arr.length-1, 0,0);
        System.out.println(Arrays.toString(arr));

    }

    static void reverseTriangle(int row, int count){
        if(row == 0){
            return;
        }

        if(count<row){
            System.out.print("*");
            reverseTriangle(row, count+1);
        }
        else{
            System.out.println();
            reverseTriangle(row-1, 0);
        }
    }

    static void normalTriangle(int row, int count){
        if(row == 0){
            return;
        }

        if(count<row){
            normalTriangle(row, count+1);
            System.out.print("*");

        }
        else{
            normalTriangle(row-1, 0);
            System.out.println();

        }
    }

    static void bubbleSort(int[] arr, int row, int col){
        if(row == 0){
            return;
        }

        if(col < row){
            if(arr[col]>arr[col+1]){
                int temp = arr[col];
                arr[col]=arr[col+1];
                arr[col+1]=temp;
            }
            bubbleSort(arr, row, col+1);
        }
        else{
            bubbleSort(arr, row-1, 0);

        }
    }

    public static void selectionSort(int[] arr, int row, int col, int max){
        if(row==0){
            return;
        }
        if(col<row){
            if(arr[col]> arr[max]){
                selectionSort(arr,row,col+1, col);
            }else {
                selectionSort(arr,row,col+1, max);

            }
        }
        else{
            int temp = arr[max];
            arr[max]=arr[row-1];
            arr[row-1]=temp;
            selectionSort(arr, row-1, 0,0);
        }
    }
}
