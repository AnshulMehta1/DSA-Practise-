import java.io.*;
import java.util.*;
public class OrderagnosticBinarySearch {
    
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9,10};
        int[] arr2={10,9,8,7,6,5,4,3,2,1};
        int target=3;
        int ans1=orderABS(arr,target);
        int ans2=orderABS(arr2,target);
        System.out.println(ans1+" "+ans2);
        

    }
    public static int orderABS(int[] arr,int target){
        int start =0;
        int end=arr.length-1;
        if (arr[start]<arr[end]) {
            int ans=binarySearchA(arr,target);
            return ans;
        }
        else{
            int ans=binarySearchD(arr,target);
            return ans;
        }
        
    }

    public static int binarySearchA(int[] arr,int target){
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
        //  In case none of  that works than -1 
        return -1;
    } 
    public static int binarySearchD(int[] arr,int target){
        int start=0; //  0th Index
        int end = arr.length-1; // Last Index
        while (start<=end){
            int mid=(start+end)/2;
            if (target<arr[mid]){
                start=mid+1;
                // Remember that mid is an index itself 
            }
            else if (target>arr[mid]){
               
                end=mid-1;

            }
            else{
                return mid;
            }
        }
        //  In case none of  that works than -1 
        return -1;
    } 

    
}
