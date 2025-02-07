package org.stringbuilderbuffersearching.challengeproblemsearching.targetindex;
import static java.lang.System.*;

import java.util.Scanner;
import java.util.Arrays;

public class TargetIndex {
    public static int binarysearch(int[]arr,int target){
        int n = arr.length;

        //sorting the array
        Arrays.sort(arr);


        //binary search
        int left = 0, right = n-1;

        while(left < right){
            int mid = (left + right)/2;

            if(arr[mid] == target){
                return mid;
            }
            else if(arr[mid] < target){
                left = mid + 1;

            }
            else if(arr[mid] > target){
                right = mid-1;
            }
        }
        return -1;
    }

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        int arr[] = {2,4,3,5,1,6,4,8,7,9};
        //1,2,3,4,4,5,6
        out.println("Enter the number to found : ");
        int number = sc.nextInt();

        if(binarysearch(arr,number)== -1){
            out.println("Number Not Found !");
        }else {
            out.println("Number Found at "+binarysearch(arr,number)+" index");
        }
    }
}
