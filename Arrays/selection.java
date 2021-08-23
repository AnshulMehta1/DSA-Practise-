import java.util.*;
import java.io.*;
public class selection {
    public static void main(String[] args){
        int[] arr={4,5,1,2,3};
        SelectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void SelectionSort(int[] arr){
        for (int i = 0; i < arr.length;i++){
            int lastIndex=arr.length-i-1;
            // Swap this with the maximum Index
            int maxI=maxIndex(arr,0,lastIndex);
            swap(arr,maxI,lastIndex);
        }
    }
    public static int maxIndex(int[] arr,int start,int end){
        int max=start;
        for (int i = start; i < end; i++){
            if (arr[max]<arr[i]){
                max=i;
            }
        }

        return max;
    }
    public static void swap(int[] arr,int start,int end){
        int temp;
        temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;

    }
}
