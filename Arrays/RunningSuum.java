import java.util.*;
import java.io.*;
public class RunningSum {
    public static void main(String[] args){

    }
    public static int[] Rsum(int[] arr){
        // Running SUm means add the number till the previous element 
        // [1,2,3,4]  --> [1,3,6,10]
        int sum=0;
        for (int i = 1; i < arr.length; i++){
            //  sum =sum+arr[i];
            //  arr[i] = arr[i]+sum;
            arr[i]=arr[i]+arr[i-1];

        }
        return arr;
    }
}
