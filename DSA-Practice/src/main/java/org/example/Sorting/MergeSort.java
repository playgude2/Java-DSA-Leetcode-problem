package org.example.Sorting;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {8,3,4,12,5,6};
        arr = mergerSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static int[] mergerSort(int[] arr){
        if(arr.length == 1){
            return arr;
        }

        int mid = arr.length / 2;

        int[] leftArr = mergerSort(Arrays.copyOfRange(arr, 0, mid));
        int[] rightArr = mergerSort(Arrays.copyOfRange(arr, mid, arr.length));

        return merge(leftArr, rightArr);
    }

    private static int[] merge(int[] leftArr, int[] rightArr) {
        int [] mix = new int[leftArr.length + rightArr.length];
        int i = 0;
        int j = 0;
        int k = 0;

        while (i<leftArr.length && j<rightArr.length){
            if(leftArr[i]< rightArr[j]){
                mix[k]= leftArr[i];
                i++;
            }
            else {
                mix[k]= rightArr[j];
                j++;
            }
            k++;
        }

        while (i<leftArr.length){
            mix[k]= leftArr[i];
            i++;
            k++;
        }

        while (j<rightArr.length){
            mix[k]= rightArr[j];
            j++;
            k++;
        }

        return mix;

    }
}
