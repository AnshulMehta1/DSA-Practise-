import java.util.*;
import java.io.*;

import java.io.*;
public class BinarySearch {
    public static void main(String[] args){
        int[] arr={1,12,22,32,42,52,62,72};
        // Initializing the array 
        System.out.println(binarySearch(arr,12));
        
        //  Make the call of the Binary Search Function
    }
    
    public static int binarySearch(int[] arr,int target){
        int start=0; //  0th Index
        int end = arr.length-1; // Last Index
        while (start<=end){
            int mid=start+(end-start)/2;
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
