package org.stringbuilderbuffersearching.binarysearch.findtherotationpoint;

import static java.lang.System.*;
public class FindTheRotationPoint {

    public static int findrotationpoint(int []arr){
        int n = arr.length;

        int left = 0, right = n-1;


        while(left <= right){
            int mid = left + (right-left)/2;
            if(left == right ){
                return left;
            }
            else if(arr[mid] > arr[right]){
                left = mid+1;
            }
            else if (arr[mid] < arr[right]) {
                right = mid;
            }
        }

        return -1;
    }

    public static void main(String[]args){

        int [] rotated = {3,4,5,6,1,2};
        out.println("The array is : ");
        for(int i: rotated){
            out.print(i+" ");
        }

        out.println();
        int smallest = findrotationpoint(rotated);
        out.println("The smallest element in the array is : "+smallest);
    }
}
