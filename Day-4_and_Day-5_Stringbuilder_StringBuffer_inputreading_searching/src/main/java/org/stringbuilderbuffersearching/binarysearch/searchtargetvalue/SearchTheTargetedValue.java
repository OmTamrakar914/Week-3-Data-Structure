package org.stringbuilderbuffersearching.binarysearch.searchtargetvalue;
import static java.lang.System.*;

import java.util.Scanner;
public class SearchTheTargetedValue {

    public static boolean findtarget(int[][] matrix,int target){

        int Irows = matrix.length; // no. of rows
        int Icolumns = matrix[0].length; //no. of columns
        int left = 0, right = Irows*Icolumns-1;

        while(left <= right){
            int mid = (left+right)/2;
            int rows = mid / Icolumns;
            int columns = mid % Icolumns;

            //if element found return true
            if(matrix[rows][columns] == target){
                return true;
            }
            else if (matrix[rows][columns] < target) {
                left = mid+1;
            }
            else if(matrix[rows][columns] > target){
                right = mid-1;
            }
        }
        return false;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int [][] matrix = {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20}};

        out.println("Enter the element to search : ");
        int target = sc.nextInt();  // taking input

        if(findtarget(matrix,target)) out.println("Element Found!");
        else out.println("Element Not Found!");

    }
}
