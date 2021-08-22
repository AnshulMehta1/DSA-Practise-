import java.io.*;
import java.util.*;

public class ceilingOfNumber {
    public static void main(String[] args){
        int[] arr={2,3,5,9,14,16,18};
        int target=15;
        // Find the Ceiling of a given number 
        System.out.println(ceiling(arr,target));
    }
    public static int ceiling(int[] arr,int target){
        int start=0; //  0th Index
        int end = arr.length-1; // Last Index
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
        //  In case none of  that works than we will here not return -1 but a number that is greater than target element
        
        return arr[start];
    } 
    
}
