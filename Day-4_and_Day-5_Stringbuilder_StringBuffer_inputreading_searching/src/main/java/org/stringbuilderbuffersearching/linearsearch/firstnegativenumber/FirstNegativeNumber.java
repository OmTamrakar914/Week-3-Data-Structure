package org.stringbuilderbuffersearching.linearsearch.firstnegativenumber;
import static java.lang.System.*;

public class FirstNegativeNumber {
    public static int firstNegative(int[]arr){
        int n = arr.length;

        for(int i=0; i<n; i++){
            if(arr[i] < 0){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[]args){
        int [] arr = {1,4,3,7,5,0,-4,6,-2};

        out.println("The Array is : " );
        for(int i:arr) out.print(i+" ");
        out.println();
        out.println("The Index of First Negative number is : "+firstNegative(arr));

    }
}
