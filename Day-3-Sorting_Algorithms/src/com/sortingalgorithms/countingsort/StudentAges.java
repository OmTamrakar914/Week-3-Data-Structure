package com.sortingalgorithms.countingsort;

import java.util.Arrays;

public class StudentAges {
    public static void main(String[] args) {
        int[] ages = {12, 15, 11, 18, 12, 14, 10, 13, 17, 16, 15, 10};

        int[] sortedAges = CountingSort.countSort(ages);
        System.out.println(Arrays.toString(sortedAges));
    }
}
