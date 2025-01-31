package com.sortingalgorithms.heapsort;

public class ExpectedSalaryDemands {
    public static void main(String[] args) {
        int[] salaries = {100, 293, 3993, 1230, 133, 2322, 1231};


        System.out.println("Salaries of Applicants before sorting.");
        for (int salary : salaries) {
            System.out.print(salary + " ");
        }
        HeapSort obj = new HeapSort();
        obj.heapSort(salaries);
        System.out.println("\nSalaries of Applicants after sorting.");
        for (int salary : salaries) {
            System.out.print(salary + " ");
        }
    }
}