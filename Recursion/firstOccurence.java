import java.util.*;
import java.io.*;
public class firstOccurence {
    public static void main(String[] args){

    }

    public static int first(int[] arr,int index,int target){
       
        if (index==arr.length){
            return -1;
        }
        if (arr[index]==target){
            return index;
        }
        else{
            int firstIndextemp=first(arr,index+1,target);
            return firstIndextemp;
        }
    }
}
