package com.sortingalgorithms.quicksort;

public class EcommerceProductPrice {
    public static void main(String[]args){
        QuickSort sort = new QuickSort();

        int productPrices[]={25,11,14,27,18,21};
        sort.quickSort(productPrices,0, productPrices.length - 1);
    }
}
