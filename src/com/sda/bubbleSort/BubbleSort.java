package com.sda.bubbleSort;

import java.util.Random;

public class BubbleSort {
    static int arrSize = 20, upperBound = 26;

    public static void main(String[] args) {
        int[] arr = new int[arrSize];
        Random rand = new Random();
        for (int i = 0; i < arr.length; ++i)
            arr[i] = rand.nextInt(upperBound)-5;
        int[] sortedArr = sort(arr);
        for(int i = 0; i < sortedArr.length; ++i)
            System.out.print(sortedArr[i] + " ");
        // write your code here
    }

    private static int[] sort(int[] arr) {
        boolean isSorted = false;
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < arr.length-1; i++) {
                if(arr[i] > arr[i+1]) {
                    int tmp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = tmp;
                    isSorted = false;
                }
            }
        }
        return arr;
    }
}
