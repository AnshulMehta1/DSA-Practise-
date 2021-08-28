// Leet Code 1920
import java.util.*;
import java.io.*;
public class buildArray {
    public static void main(String[] args) {

        int[] nums = {0,2,1,5,3,4};
        int[] ans=buildarr(nums);
        System.out.println(Arrays.toString(ans));
    }
    public static int[] buildarr(int[] arr){
        int start=0;
        int end=arr.length;
        int[] ans=new int[arr.length];
        // Condition is ans[i]=arr[arr[i]]
        for (int i=0;i<end;i++){
            ans[i]=arr[arr[i]];
        }
        return ans;
    }
}
