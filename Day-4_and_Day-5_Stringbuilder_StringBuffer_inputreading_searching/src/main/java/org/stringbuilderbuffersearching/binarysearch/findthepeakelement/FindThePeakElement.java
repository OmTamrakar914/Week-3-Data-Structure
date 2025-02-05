package org.stringbuilderbuffersearching.binarysearch.findthepeakelement;

import static java.lang.System.*;
public class FindThePeakElement {

    public static int peakElement(int []arr){
        int n = arr.length;

        int left = 0, right = n-1;
        while(left <= right){
            int mid = left + (right-left)/2;

            if (arr[mid] > arr[mid-1]  && arr[mid] > arr[mid+1]) {
                return arr[mid];
            } else if (arr[mid] < arr[mid-1]) {
                right = mid - 1;
            } else if (arr[mid]  < arr[mid+1]) {
                left = mid+1;
            }
        }
        return -1;
    }


    public static void main(String[]args){
        int peak[] = {1,3,2,4,5,7,4};
        out.println("The array is : ");

        for(int i:peak) out.print(i+" ");
        out.println();
        int peaks = peakElement(peak);
        out.println("The peak element of the array is : "+peaks);
    }
}
