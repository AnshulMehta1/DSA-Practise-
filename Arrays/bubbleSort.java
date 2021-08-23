import java.io.*;
import java.util.*;
public class bubbleSort {
    public static void main(String[] args){
        int[] arr={3,1,5,4,2};
        BS(arr);
        System.out.println(Arrays.toString(arr));

    }
    public static void BS(int[] arr){
        int temp;
        for (int i=0;i<arr.length-1;i++){
            for (int j=0;j<arr.length-1;j++){
                if (arr[j]>arr[j+1]){
                    temp=arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] =temp;

                }
            }
        }
    }
    
}
