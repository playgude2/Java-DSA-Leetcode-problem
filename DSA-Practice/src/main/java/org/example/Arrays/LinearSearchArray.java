package org.example.Arrays;

import java.util.ArrayList;

public class LinearSearchArray {
    public static void main(String[] args) {
        int [] arr1 = {1,2,4,8, 4,10, 8,9,12};
        int target = 8;
        System.out.println(linearSearch(arr1,target,0));
        System.out.println(linearSearchfromLast(arr1,target,arr1.length-1));
       findAllIndexes(arr1,target,0);
        System.out.println(list);

        System.out.println(findAllIndexes2(arr1, 4, 0));

    }

    static int linearSearch(int[] arr, int target, int index){

        if(target==arr[index]){
            return index;
        }

        return linearSearch(arr,target,index+1);
    }

    static int linearSearchfromLast(int[] arr, int target, int index){
        if(index<0){
            return -1;
        }
        if(target==arr[index]){
            return index;
        }

        return linearSearchfromLast(arr,target,index-1);
    }

    static ArrayList<Integer> list = new ArrayList<>();
   static void findAllIndexes(int[] arr, int target, int index){
        if(index == arr.length){
            return;
        }
        if(target==arr[index]){
            list.add(index);
        }

       findAllIndexes(arr, target, index+1);
    }

    static ArrayList<Integer> findAllIndexes2(int[] arr, int target, int index){
       ArrayList<Integer> list = new ArrayList<>();
        if(index == arr.length){
            return list;
        }
        //this will contain answer for that function call
        if(target==arr[index]){
            list.add(index);
        }

        ArrayList<Integer>ansFromBelowCalls = findAllIndexes2(arr, target, index+1);
         list.addAll(ansFromBelowCalls);
         return list;
    }
}
