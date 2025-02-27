package org.example.Arrays;

public class ArraySortedOrNot {
    public static void main(String[] args) {
        int [] arr1 = {1,2,4,8,9,12};
        int [] arr2 = {1,2,4,3,9,8};
        System.out.println(sortedOrNot(arr1,0));
        System.out.println(sortedOrNot(arr2,0));

    }

    static boolean sortedOrNot(int[] arr, int index){
        if(index == arr.length-1){
            return true;
        }
        return arr[index]<arr[index+1] && sortedOrNot(arr,index+1);
    }


}
