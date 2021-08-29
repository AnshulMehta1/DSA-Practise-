import java.util.*;
import java.io.*;
public class MissingNumber {
    public static void main(String[] args){

    }
    
    public static int missingNumber(int[] arr) {
        int i = 0;
        while (i < arr.length) {
           
            if (arr[i]<arr.length && arr[i] != arr[arr[i]]) {
                swap(arr, i , arr[i]);
            } else {
                i++;
            }
        }
        //  Search for missing Number 
        for (int j = 0; j < arr.length; j++) {
            if (arr[j]!=j){
                return ;
            }
        }
    }

    public static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

}
