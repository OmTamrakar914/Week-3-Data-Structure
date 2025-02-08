package recursiveinterativecomputation;

import org.junit.jupiter.api.Test;

import static java.lang.System.out;

public class RecursiveIterativeFibonacciComputationTest {
    @Test
    void test(){
        int [] arr = {10,30,50};

        for(int arrs : arr){
            out.println("The Time for Fibonacci series calculation for Recursive and Iterative  are at - "+arrs);
            long startTime,endTime;
            startTime = System.nanoTime();
            int recureAns = RecursiveIterativeFibonacciComputation.fibonacciRecursive(arrs);
            endTime = System.nanoTime();
            out.println("Time of Recursive approach : "+(double)(endTime-startTime));

            startTime = System.nanoTime();
            int iterateAns = RecursiveIterativeFibonacciComputation.fibonacciIterative(arrs);
            endTime = System.nanoTime();
            out.println("Time of Iterative approach : "+(double)(endTime-startTime));
    }
  }
}
