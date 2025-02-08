package comparingdatastructures;


import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.HashSet;
import java.util.TreeSet;

import static java.lang.System.out;

public class ComparingDifferentDataStructuresTest {

    @Test
    void testing() {
        int arr[] = {1000,10000,1000000};

        for(int arrs : arr){
            int newArr[] = new int[arrs];
            HashSet<Integer> set = new HashSet<>(arrs);
            TreeSet<Integer> treeset = new TreeSet<>(Collections.singleton(arrs));

            for(int i=0; i<newArr.length; i++){
                newArr[i] = i+1;
                set.add(i+1);
                treeset.add(i+1);
            }

            int target = arrs - 99;
            out.println("The Time for Searching of different data structures are at "+arrs);

            long startTime, endTime;

            startTime = System.nanoTime();
            int ansArr = ComparingDifferentDataStructuresforSearching.arrayLinearSearch(newArr, target);
            endTime = System.nanoTime();
            out.println("Time taken by Array : "+(double)(endTime-startTime)/1000+" ms");

            startTime = System.nanoTime();
            boolean ansHashset = set.contains(target);
            endTime = System.nanoTime();
            out.println("Time taken by HashSet : "+(double)(endTime-startTime)/1000+" ms");

            startTime = System.nanoTime();
            boolean anstreeSet = treeset.contains(target);
            endTime = System.nanoTime();
            out.println("Time taken by TreeSet : "+(double)(endTime-startTime)/1000+" ms");
        }
    }
}
