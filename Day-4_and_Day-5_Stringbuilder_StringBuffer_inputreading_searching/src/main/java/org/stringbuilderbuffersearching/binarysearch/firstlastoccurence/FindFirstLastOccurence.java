package org.stringbuilderbuffersearching.binarysearch.firstlastoccurence;
import static java.lang.System.*;
import java.util.Scanner;
public class FindFirstLastOccurence {

    public static int firstoccurence(int[] arr,int target){

        int n = arr.length;
        int left = 0, right = n-1;
        int firstOccurence = -1;
        while(left <= right){

            int mid = (left+right)/2;

            if(arr[mid] == target){
                   firstOccurence = mid;
                    right = mid-1;
            }
            else if (arr[mid] < target) {
                left = mid+1;
            }
            else if (arr[mid] > target) {
                right = mid-1;
            }
        }
        return firstOccurence;
    }

    // Finding last Occurence

    public static int lastOccurence(int[]arr, int target){

        int n = arr.length;
        int lastoccured = -1;
        int left = 0, right = n-1;

        while(left <= right){
            int mid = (left+right)/2;

            if(arr[mid] == target){
              lastoccured = mid;
              left = mid+1;
            } else if (arr[mid] < target )  {
                left = mid+1;
            }
            else if(arr[mid] > target){
                right = mid-1;
            }
        }
        return lastoccured;
    }

    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);
        int arr[] = {1,2,3,3,5,5,5,5,5,5,7,3,4};
        out.println("The array is : ");

        for(int i : arr)  out.print(i+" ");

        out.println();
        out.println("Enter the number : ");
        int number = sc.nextInt();
        out.println("The First Occurence of "+ number + " at "+firstoccurence(arr,number));
        out.println("The Last Occurence of "+ number + " at "+lastOccurence(arr,number));


    }
}
