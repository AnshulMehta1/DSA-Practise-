import java.util.*;
import java.io.*;

public class minNumber {
    public static void main(String[] args){
        int[] arr={23,56,45,12,9,88,99,74,66,33};
        // Define an array
        int ans=minimumNum(arr);
        System.out.println(ans);
    }
    public static int minimumNum(int arr[]){
        int min=arr[0];
        for (int k=0; k<=arr.length-1; k++){
            if (arr[k]<min){
                min=arr[k];
            }
        }
        return min;
    }
}
