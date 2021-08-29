import java.util.*;
import java.io.*;
public class allDisapperedNumbers {
    public static void main(String[] args){

    }
    public static List<Integer> findNumbers(int[] arr){
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] -1;
            if (arr[i] != arr[correct]) {
                swap(arr, i , correct);
            } else {
                i++;
            }
        }
        //  Find alll Missing Numbers 
        List<Integer> ans=new ArrayList<Integer>(); 
        for (int j = 0; j < arr.length; j++){
            if (arr[j]!=j+1){
                ans.add(j+1);
            }
            
        }
        return ans;
    }
    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
