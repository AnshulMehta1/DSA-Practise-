
import java.util.*;
import java.io.*;
public class reverseArray {
    public static void main(String[] args){
        int[] arr={23,56,45,12,9,88,99,74,66,33};
        //  Now just call the function of reverseArray.
        reverseArray(arr);
        System.out.println(Arrays.toString(arr));
        // reverseArray(arr);
    }
    public static void swap(int[] arr,int a , int b){
        int temp = arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
    public static void reverseArray (int[] arr){
        int start=0;
        int end=arr.length-1;
        while (start<end){
            swap(arr,start,end);
            start++; end--;
        }
        // Keep swapping start points and end points to reverse an array

    }
}
