package org.stringbuilderbuffersearching.challengeproblemsearching.firstmissingpositiveinteger;
import java.util.Arrays;

import static java.lang.System.*;
public class FirstMissingPositiveInteger {

    public static int firstmissingpositive(int []arr){

        int n = arr.length;
        int firstMiss = 1;

        //Sorting the array
        Arrays.sort(arr);

        //checking for first missing positive integer
        for(int i=0; i<n; i++){
            if(arr[i] == firstMiss){
                firstMiss++;
            }
        }
        return firstMiss;
    }

    public static void main(String[] args){
        int arr[] = {1,-2,2,3,4,5,7,6};

        int ans = firstmissingpositive(arr);
        out.println(ans);
    }
}
