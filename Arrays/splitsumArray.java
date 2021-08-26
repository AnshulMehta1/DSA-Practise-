import java.util.*;
import java.io.*;
public class splitsumArray {
    public static void main(String[] args){
        int[] arr={7,2,5,8,10};
        int m=2;
        int ans=splitArray(arr,m);
        System.out.println(ans);

    }
    public static int splitArray(int[] arr, int m){
        int start=0;
        int end=0;
        for (int i=0; i<arr.length; i++){
            start=Math.max(start, arr[i]);  // The maximum singular element 
            end=end+arr[i];
        }
        while (start<end){
            int mid=start+(end-start)/2;
            //  Calculate how many pieces can it be divided
            int sum=0;
            int pieces=1;
            for (int ele:arr){
                if(sum+ele>mid){
                    // Therefore we cannot add it in a new sub array 
                    //  Add in a new sub array 
                    sum=ele;
                    pieces++;
                }
                else {
                    sum+=ele;
                }
            }
            if (pieces>m){
                start=mid+1;
            } 
            else {
                end=mid;
            }
        }
        return end;
    }
}
