import java.util.*;
import java.io.*;
public class GoodPairs {
    public static void main(String[] args){

    }
    public static int GP(int[] arr){
        // A good Pair is when arr[i]==arr[j] but i<j
        int res=0;
        int temp[]=new int[101];
        for (int i=0; i<arr.length; i++){
            res+=temp[arr[i]];
            temp[arr[i]]++;
        }

        return res;
    }
}
