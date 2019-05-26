package com.sda.bubbleSort;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BubbleSort {
    static int arrSize = 10000000, upperBound = 26, repeatsNo = 100;
    static float msMultipler = 1000000f;

    public static void main(String[] args) {
        int[] v = {1, 6, 18, 22, 28};
        int[] w = {1, 2, 5, 6, 7};
        int maxW = 11;

        System.out.println(knapsack(v, w, maxW));
    }

    private static int knapsack(int[] v, int[] w, int maxW) {
        int[][] value = new int[w.length+1][maxW+1];
        for(int i = 1; i < w.length+1; ++i) {
            for(int j = 1; j < maxW+1; ++j) {
                if(j-w[i-1] < 0) {
                    value[i][j] = value[i-1][j];
                    continue;
                }
                value[i][j] = Math.max(value[i-1][j], v[i-1] + value[i-1][j-w[i-1]]);
            }
        }
        return value[w.length][maxW];
    }

    private static int[] sort(int[] arr) {

                /*String dupa = "DUPAY";
        char[] dupaArr = dupa.toCharArray();
        System.out.println(dupaArr);
        for(int i = 0; i < dupaArr.length; ++i)
            dupaArr[i] = (char)(65+(dupaArr[i] + 3)%26);
        System.out.println(dupaArr);
        for(int i = 0; i < dupaArr.length; ++i)
            dupaArr[i] = (char)(65+(dupaArr[i] - 3)%26);
        System.out.println(dupaArr); */

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

    public static int[] selectSort(int[] tableToSort){
        int temp;
        for (int i = 0; i < tableToSort.length; i++) {
            for (int j = i; j <tableToSort.length-i ; j++) {
                if(!(tableToSort[i]<tableToSort[j])){
                    temp=tableToSort[i];
                    tableToSort[i]=tableToSort[j];
                    tableToSort[j]=temp;
                }
            }
        }
        return tableToSort;
    }
}
