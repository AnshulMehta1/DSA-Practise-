import java.io.*;
import java.util.*;
//  One edge case to take care of --> Letters  wrap around 
public class smallestLetter {
    public static void main(String[] args){
        char[] arr={'c','f','j'};
        char target='c';
        System.out.println(smallestL(arr,target));
         
    }
    public static char smallestL(char[] arr,int target){
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
            // else{
            //     return mid;
            // }
        }
        //  In case none of  that works than we will here not return -1 but a number that is greater than target element
        
        return arr[start%arr.length];
    } 
}
