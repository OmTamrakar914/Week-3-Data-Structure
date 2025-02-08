package sorting;

import org.junit.jupiter.api.Test;

import static java.lang.System.out;

public class SortingLargeDataSetEfficientlyTest {

    @Test
    void test(){
        int arr[] = {1000,10000,1000000};

        for(int arrs : arr){
            int[] newarr = new int[arrs];

            for(int i=0; i<newarr.length; i++){
                newarr[i] = (int)(Math.random()*100000);
            }

            long startTime,endTime;

            out.println("The Sorting Time Taken by Merge, Quick, and Bubble Sort at N = "+newarr.length);
            startTime = System.nanoTime();
            SortingLargeDataSetEfficiently.mergeSort(newarr,0, newarr.length-1);
            endTime = System.nanoTime();
            out.println("Time Taken by MergeSort : "+(double)(endTime-startTime)/1000+" ms");

            for(int i=0; i<newarr.length; i++){
                newarr[i] = (int)(Math.random()*100000);
            }
            startTime = System.nanoTime();
            SortingLargeDataSetEfficiently.quickSort(newarr,0, newarr.length-1);
            endTime = System.nanoTime();
            out.println("Time Taken by QuickSort : "+(double)(endTime-startTime)/1000+" ms");

            for(int i=0; i<newarr.length; i++){
                newarr[i] = (int)(Math.random()*100000);
            }
            startTime = System.nanoTime();
            if(arrs != 1000000){
                SortingLargeDataSetEfficiently.bubbleSort(newarr);
            }
            endTime = System.nanoTime();
            out.println("Time Taken by BubbleSort : "+(double)(endTime-startTime)/1000+" ms");

        }
    }
}
