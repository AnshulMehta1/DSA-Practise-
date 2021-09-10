import java.util.*;
import java.io.*;
public class allOccurences {
    public static void main(String[] args){

    }
    public static int[] allIndices(int[] arr, int target, int index, int count){
        //  Count is passed in the method because there will be increment in it only element is found
        if (index ==arr.length){
            return new int [count];
        }
        if (arr[index] == target){
            int[] arr2 = allIndices(arr, target, index+1, count+1);

        }
        else {
            int[] arr2 = allIndices(arr, target, index+1, count);


        }



        return arr;
    }
}
