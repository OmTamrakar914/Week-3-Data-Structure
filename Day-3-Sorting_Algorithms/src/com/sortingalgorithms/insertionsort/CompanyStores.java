package com.sortingalgorithms.insertionsort;

public class CompanyStores {
    public static void main(String[]args){
        InsertionSort sort = new InsertionSort();
        int employeeId[] = {7,10,9,14,13,15};
        sort.insertionSort(employeeId);
        for(int i : employeeId)
            System.out.print(i+" ");
    }
}
