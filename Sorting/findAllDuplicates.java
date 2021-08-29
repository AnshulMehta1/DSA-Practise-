import java.util.*;
import java.io.*;
public class findAllDuplicates {
    public static void main(String[] args) {

    }
    public static List<Integer> duplicates(int[] arr) {
        List<Integer> ans=new ArrayList<Integer>();

        int i = 0;
        while (i < arr.length) {
            int correct=arr[i]-1;
            if (arr[i] != arr[correct]) {
                swap(arr, i , correct);
            } else {
                i++;
            }
        }
        for (int j = 0; j < arr.length; j++){
            if (arr[j]!=j+1){
                ans.add(j);
            }
            
        }
     
        return ans;
    }
    public static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

}
