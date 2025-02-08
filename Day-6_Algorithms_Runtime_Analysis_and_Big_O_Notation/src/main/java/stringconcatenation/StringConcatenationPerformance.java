package stringconcatenation;
import static java.lang.System.*;
public class StringConcatenationPerformance {

    //String Performance Check
    public static void stringConcatenate(String[] str){
      String string = "";

      for(int i=0; i<str.length; i++){

          string += str[i] + " ";
      }
    }

    //StringBuilder Performance Check
    public static void stringBuilderConcate(String[] str){

        StringBuilder sb = new StringBuilder("java ");

        for(int i=0; i<str.length; i++){
            sb.append(str[i]);
        }
    }

    //StringBuffer Performance Check
    public static void stringBufferConcate(String[] str){

        StringBuffer sf = new StringBuffer("Java ");
        for(int i=0; i<str.length; i++){
            sf.append(str[i]);
        }
    }

    public static void main(String[]args){

        int [] arr = {1000,10000,1000000};

        for(int arrs : arr){
            String strArr[] = new String[arrs];

            for(int i=0; i<strArr.length; i++){
                strArr[i] = " hello! ";
            }

            long startTime,endTime;

            out.println("The Time Taken by String, StringBuilder, and StringBuffer for appending at N = "+strArr.length);


            startTime = System.nanoTime();
            stringConcatenate(strArr);
            endTime = System.nanoTime();
            out.println("The Time taken by String : "+(double)(endTime-startTime)/1000+" ms");

            for(int i=0; i<strArr.length; i++){
                strArr[i] = " Java! ";
            }

            startTime = System.nanoTime();
            stringBuilderConcate(strArr);
            endTime = System.nanoTime();
            out.println("The Time taken by StringBuilder : "+(double)(endTime-startTime)/1000+" ms");

            for(int i=0; i<strArr.length; i++){
                strArr[i] = " Python! ";
            }

            startTime = System.nanoTime();
            stringBufferConcate(strArr);
            endTime = System.nanoTime();
            out.println("The Time taken by StringBuffer : "+(double)(endTime-startTime)/1000+" ms");
        }
    }
}
