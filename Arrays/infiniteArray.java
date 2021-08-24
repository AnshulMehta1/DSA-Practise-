import java.util.*;
import java.io.*;
public class infiniteArray {
    public static void main(String[] args){
        int target=10;
        int[] arr={3,5,7,9,10,90,100,130,140,160,170};
        System.out.println(findRange(arr,target));


    }
    public static int findRange(int[] arr, int target ){
        int start=0;
        int end=1;
        //  Condition for target to be in rannge 
        //  Therefore target must be smaller than the end 
        // Thus double the size till target is not greater than end
        while (target>arr[end]){
            int newStart=end+1;
            //  New end = prev end + twice the size of the box size of 
            //  This is because we are omitting the already searched array portion
            end=end + (end-start+1)*2;
            start=newStart;
            // Start cannot be updated before using it in edn wala formula so neStart is needed

        }
        return binarySearch(arr,target,start,end);
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
