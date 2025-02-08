package recursiveinterativecomputation;
import static java.lang.System.*;
import java.util.Scanner;

public class RecursiveIterativeFibonacciComputation {
    //Recursive
    public static int fibonacciRecursive(int n) {
        if (n <= 1) return n;
        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }

    //Iterative
    public static int fibonacciIterative(int n) {
        int a = 0, b = 1, sum;
        for (int i = 2; i <= n; i++) {
            sum = a + b;
            a = b;
            b = sum;
        }
        return b;
    }

    public static void main(String[]args){
        int [] arr = {10,30,50};

        for(int arrs : arr){
            out.println("The Time for Fibonacci series calculation for Recursive and Iterative  are at - "+arrs);
            long startTime,endTime;
            startTime = System.nanoTime();
            int recureAns = fibonacciRecursive(arrs);
            endTime = System.nanoTime();
            out.println("Time of Recursive approach : "+(double)(endTime-startTime));

            startTime = System.nanoTime();
            int iterateAns = fibonacciIterative(arrs);
            endTime = System.nanoTime();
            out.println("Time of Iterative approach : "+(double)(endTime-startTime));
        }

    }
}
