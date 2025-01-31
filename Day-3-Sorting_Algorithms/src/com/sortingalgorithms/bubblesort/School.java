package com.sortingalgorithms.bubblesort;

public class School {
    public static void main(String []args){

        BubbleSort sort = new BubbleSort();
        int arr[] = {11,10,12,9,14,8};
        sort.bubleSort(arr);
        for(int i : arr)
        System.out.print(i+" ");
    }
}
