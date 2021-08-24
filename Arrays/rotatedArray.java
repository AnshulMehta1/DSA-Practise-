// import java.util.*;
// import java.io.*;
public class rotatedArray {
    public static void main(String[] args) {

    }
    public static int Pivot(int[] arr){
        int start =0;
        int end = arr.length-1;
        while(start <= end){
            int mid=start+(end-start)/2;
            //  All the 4 cases covered 
            if (mid<end && arr[mid]>arr[mid+1]){
                return mid;

            }
            else if (mid<start && arr[mid]<arr[mid-1]){
                return mid-1;
            }
            else if(arr[mid]<=arr[start]){
                end = mid-1;

            }
            else {
                start=mid+1;
            }
        }
        return -1;
    } 
    //  Pivot Binary Search
    public static int search(int[] arr, int target) {
        int pivot=Pivot(arr);
        // If  no pivot then no rotation 
        if(pivot==-1){
            // Normal Binary Search
            return binarySearch(arr,target,0,arr.length-1);
        }
        //  If there is pivot there are two arrays ,both ascending 
        if (arr[pivot]==target){
            return pivot;
        }
        else if (target>=arr[0]){
            return binarySearch(arr,target,0,pivot-1);

        }
        else{
            return binarySearch(arr,target,pivot+1,arr.length-1);
        }
    }
    public static int binarySearch(int[] arr,int target,int start,int end){
        // int start=0; //  0th Index
        // int end = arr.length-1; // Last Index
        while (start<=end){
            int mid=(start+end)/2;
            if (target<arr[mid]){
                end=mid-1;
                // Remember that mid is an index itself 
            }
            else if (target>arr[mid]){
                start=mid+1;

            }
            else{
                return mid;
            }
        }
        //  In case none of  that works than -1 
        return -1;
    } 

    
}
