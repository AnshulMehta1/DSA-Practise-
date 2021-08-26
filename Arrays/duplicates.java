import java.io.*;
import java.util.*;
public class duplicates {
    public static void main(String[] args){

    }
    public static boolean duplicate(int[] arr){
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++){
            if (arr[i]==arr[i-1]){
                return true;
            }

        }
        return false;
    }
}
