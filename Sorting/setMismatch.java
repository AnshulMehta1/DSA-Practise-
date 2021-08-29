import java.util.*;
import java.io.*;
public class setMismatch {
    public static void main(String[] args){

    }
    public static int[] setM(int[] arr){
        int i = 0;
        int[] ans=new int[2];
        while (i < arr.length) {
            int correct = arr[i]-1 ;
            if (arr[i] != arr[correct]) {
                swap(arr, i , correct);
            } else {
                i++;
            }
        }
        for (int j = 0; j < arr.length; j++) {
            if (arr[j]!=j){
                return new int[]{arr[j], j+1};      
            }
        }
        return new int[]{-1,-1};
    }
    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
