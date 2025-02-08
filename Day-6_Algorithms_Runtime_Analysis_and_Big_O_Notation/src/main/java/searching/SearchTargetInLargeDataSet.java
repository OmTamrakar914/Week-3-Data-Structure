package searching;
import static java.lang.System.*;

public class SearchTargetInLargeDataSet {

    public static int linearSearch(int[] arr, int target){

        for(int i=0; i< arr.length; i++ ){
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }

    public static int binarySearch(int []arr, int target){

        int start = 0, end = arr.length-1;

        while(start <= end){
            int mid = start +(end-start)/2;

            if(arr[mid] == target){
                return mid;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else if (arr[mid] > target) {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[]args){

        int arr[] = {1000,10000,1000000};

        for(int arrs: arr){
            int newarr[] = new int[arrs];
            for(int i=0; i<arrs; i++){
                newarr[i] = (i+1);
            }
            long startTime = 0, endTime = 0;
            int target = arrs-5;


            out.println("calculating Searching Time for Linear and Binary Search at n = "+newarr.length);
            startTime = System.nanoTime();
            int index = linearSearch(newarr, target);
            endTime = System.nanoTime();
            if( index != -1){
                out.println("The Searching Time for Linear search is : "+(double)(endTime-startTime)/1000+" ms");
            }

            startTime = System.nanoTime();
           int index1 = binarySearch(newarr, target);
            endTime = System.nanoTime();
            if( index1 != -1){
                out.println("The Searching Time for Binary search is : "+(double)(endTime-startTime)/1000+" ms");
            }

        }

    }

}
