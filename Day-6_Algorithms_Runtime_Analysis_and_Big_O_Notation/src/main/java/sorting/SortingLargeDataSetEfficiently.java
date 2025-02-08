package sorting;
import static java.lang.System.*;
import java.util.Arrays;

public class SortingLargeDataSetEfficiently {

    public static  double mergeSort(int[] arr, int left, int right){
        double startTime,endTime;
        startTime = System.nanoTime();
        if(left < right){
            int mid = left + (right - left)/2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid+1,right);
            merge(arr,left,mid,right);
        }
        endTime = System.nanoTime();
        return (endTime-startTime)/1000;
    }
    public static void merge(int[]arr, int left, int mid, int right ){
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int leftArr[] = new int[n1];
        int rightArr[] = new int[n2];

        System.arraycopy(arr,left,leftArr,0,n1);
        System.arraycopy(arr,mid+1,rightArr, 0, n2);

        int i= 0,j=0, k = left;
        while(i<n1 && j<n2){
            if(leftArr[i] <=  rightArr[j]){
                arr[k++] = leftArr[i++];
            }
            else{
                arr[k++] = rightArr[j++];
            }
        }
        while(i<n1) arr[k++] = leftArr[i++];
        while(j<n2) arr[k++] = rightArr[j++];
    }

    //Quick Sort
    public static double quickSort(int []arr, int left, int right){

        double startTime,endTime;
        startTime = System.nanoTime();
        if(left < right){
         int pivot = partitions(arr,left,right);
            quickSort(arr,left,pivot-1);
            quickSort(arr,pivot+1,right);
        }
        endTime = System.nanoTime();
        return (endTime-startTime)/1000;
    }
    public static int partitions(int[]arr, int left,  int right){
        int pivot = arr[right];
        int i = left - 1;

        for(int j = left ; j<right; j++){
            if(arr[j] < pivot){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i+1];
        arr[i+1] = arr[right];
        arr[right] = temp;
        return i+1;
    }

    //Bubble Sort

    public static double bubbleSort(int[]arr){
        double startTime,endTime;
        startTime = System.nanoTime();
        int n = arr.length;
        for(int i=0; i<n-1; i++){
            for(int j=0; j<n-i-1; j++){
                if(arr[j] < arr[i]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        endTime = System.nanoTime();
        return (endTime-startTime)/1000;
    }

    public static void main(String[]args){

        int arr[] = {1000,10000,1000000};

        for(int arrs : arr){
            int[] newarr = new int[arrs];

            for(int i=0; i<newarr.length; i++){
                newarr[i] = (int)(Math.random()*100000);
            }

            long startTime,endTime;

            out.println("The Sorting Time Taken by Merge, Quick, and Bubble Sort at N = "+newarr.length);
            startTime = System.nanoTime();
            mergeSort(newarr,0, newarr.length-1);
            endTime = System.nanoTime();
            out.println("Time Taken by MergeSort : "+(double)(endTime-startTime)/1000+" ms");

            for(int i=0; i<newarr.length; i++){
                newarr[i] = (int)(Math.random()*100000);
            }
            startTime = System.nanoTime();
            quickSort(newarr,0, newarr.length-1);
            endTime = System.nanoTime();
            out.println("Time Taken by QuickSort : "+(double)(endTime-startTime)/1000+" ms");

            for(int i=0; i<newarr.length; i++){
                newarr[i] = (int)(Math.random()*100000);
            }
            startTime = System.nanoTime();
            if(arrs != 1000000){
                bubbleSort(newarr);
            }
            endTime = System.nanoTime();
            out.println("Time Taken by BubbleSort : "+(double)(endTime-startTime)/1000+" ms");

        }
    }

}
