package stringconcatenation;

import org.junit.jupiter.api.Test;

import static java.lang.System.out;

public class StringConcatenationPerformanceTest {

    @Test
    void test(){
        int [] arr = {1000,10000,1000000};

        for(int arrs : arr){
            String strArr[] = new String[arrs];

            for(int i=0; i<strArr.length; i++){
                strArr[i] = " hello! ";
            }

            long startTime,endTime;

            out.println("The Time Taken by String, StringBuilder, and StringBuffer for appending at N = "+strArr.length);


            startTime = System.nanoTime();
            StringConcatenationPerformance.stringConcatenate(strArr);
            endTime = System.nanoTime();
            out.println("The Time taken by String : "+(double)(endTime-startTime)/1000+" ms");

            for(int i=0; i<strArr.length; i++){
                strArr[i] = " Java! ";
            }

            startTime = System.nanoTime();
            StringConcatenationPerformance.stringBuilderConcate(strArr);
            endTime = System.nanoTime();
            out.println("The Time taken by StringBuilder : "+(double)(endTime-startTime)/1000+" ms");

            for(int i=0; i<strArr.length; i++){
                strArr[i] = " Python! ";
            }

            startTime = System.nanoTime();
            StringConcatenationPerformance.stringBufferConcate(strArr);
            endTime = System.nanoTime();
            out.println("The Time taken by StringBuffer : "+(double)(endTime-startTime)/1000+" ms");
        }
    }
}
