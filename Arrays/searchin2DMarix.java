import java.util.*;
import java.io.*;
public class searchin2DMarix {
    public static void main(String[] args){

    }

    public static boolean Matrix2d(int[][] arr, int target){
        for(int[] i: arr){
            if(binarySearch(i,target, 0, i.length-1))
                return true;
        }
        return false;
    }
    public static boolean binarySearch(int[] arr,int target,int start,int end){
        
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
                return true;
            }
        }
        //  In case none of  that works than -1 
        return false;
    } 
}
