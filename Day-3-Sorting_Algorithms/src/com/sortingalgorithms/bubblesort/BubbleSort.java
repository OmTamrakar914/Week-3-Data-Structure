package com.sortingalgorithms.bubblesort;

public class BubbleSort {
    public void bubleSort(int[]arr){
        int n = arr.length;

        boolean stepped ;
        for(int i=0; i<n-1; i++){
            stepped = false;
            for(int j=0; j<n-i-1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1]= temp;
                }
                stepped = true;
            }
            if(!stepped) break;
         }
    }
}
