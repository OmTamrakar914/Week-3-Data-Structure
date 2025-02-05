package org.stringbuilderbuffersearching.challengeproblem.comparestringbuilderandbuffer;

public class CompareStringBuilderAndBuffer {
    public static void performanceComparison(){
        //variable for time record
        long startTime=0, endTime=0;

        //StringBuilder
        //checking Performance of StringBuilder in string concatenation

        startTime = System.nanoTime(); // starting the time

        StringBuilder sb = new StringBuilder("String Contecatenation");
        //starting appending strings
        for(long i = 1; i<=1000000; i++){
            sb.append(" hello");
        }
        endTime = System.nanoTime();  // Ending the time
        long strinbuilderTime = endTime-startTime;
        System.out.println("The StringBuilder Time for String Concatenation is : "+strinbuilderTime+" ns");

        //StringBuffer
        //Testing the time for StringBuffer

        startTime = System.nanoTime();

        StringBuffer sf = new StringBuffer("String Contecatenation");

        //Starting appending strings
        for(long i =1; i<=1000000; i++){
            sf.append(" hello");
        }
        endTime = System.nanoTime(); //stopping the time

        long StringbufferTime = endTime-startTime;

        System.out.println("The StringBuffer Time for String Concatenation is  : "+StringbufferTime+" ns");

    }

    public static void main(String[]args){

        //Checking the Performance of the Stringbuilder and Stringbuffer

        performanceComparison();
    }
}
