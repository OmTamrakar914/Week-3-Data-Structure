package com.sortingalgorithms.mergesort;

public class BookStore {
 public static void main(String[]args){
     MergeSort sort = new MergeSort();
     int bookprice[] = {10,13,8,12,9,14,25};
     sort.mergeSort(bookprice,0,6);

     for(int i:bookprice){
         System.out.print(i+" ");
     }
 }
}
