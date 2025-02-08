package searching;

import org.junit.jupiter.api.Test;

import static java.lang.System.out;

public class SearchTargetLargeDataSetTest {
    @Test
    void test() {
        int arr[] = {1000, 10000, 1000000};

        for (int arrs : arr) {
            int newarr[] = new int[arrs];
            for (int i = 0; i < arrs; i++) {
                newarr[i] = (i + 1);
            }
            long startTime = 0, endTime = 0;
            int target = arrs - 5;


            out.println("calculating Searching Time for Linear and Binary Search at n = " + newarr.length);
            startTime = System.nanoTime();
            int index = SearchTargetInLargeDataSet.linearSearch(newarr, target);
            endTime = System.nanoTime();
            if (index != -1) {
                out.println("The Searching Time for Linear search is : " + (double) (endTime - startTime) / 1000 + " ms");
            }

            startTime = System.nanoTime();
            int index1 = SearchTargetInLargeDataSet.binarySearch(newarr, target);
            endTime = System.nanoTime();
            if (index1 != -1) {
                out.println("The Searching Time for Binary search is : " + (double) (endTime - startTime) / 1000 + " ms");
            }

        }
    }
}
