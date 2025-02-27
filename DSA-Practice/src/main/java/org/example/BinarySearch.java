package org.example;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr= {1,3,56,78,90,101};
        int target = 56;
        System.out.println(bs(arr,target,0, arr.length - 1));
    }

    public static int bs(int arr[], int target, int start, int end){
        System.out.println("start" + start);
        System.out.println("end" + end);

        if(start>end){
            return -1;
        }

        int middle = start + (end - start)/2;
        System.out.println("middle:::"+ middle);

        if(arr[middle] == target){
            return middle;
        }

        if(target<arr[middle]){
            return bs(arr,target,start,middle-1);
        }
        return bs(arr,target,middle+1,end);
    }
}
