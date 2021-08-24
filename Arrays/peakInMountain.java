import java.util.*;
import java.io.*;
public class peakInMountain {
    public static void main(String[] args){

        // int[] Mountain={1,2,3,4,5,6,5,4,3,2,1};
        // int ans=FindPeak(Mountain);
        // System.out.println(ans);
    }
    public static int FindPeak(int[] arr){
        int start=0;
        int end=arr.length-1;
        while (start<end){
            int mid=start+(end-start)/2;
            if(arr[mid]>arr[mid-+1]){
                //  This means we are in the decreasing array part of the mountain
                //  So now we will only check the left hand remaining
                //  This is because there is no guarantee that there will be an element bigger so we inlude the end in the remainder part yet and cannot discard it 
                end=mid;
            }
            else if(arr[mid]<arr[mid+1]){
                // This means we are in the ascending part of mountain
                //  This means we can do start = mid +1 and wen can discard the curr mid as there is    / definitely going to be a peak element that is bigger than the current middle element 
                start=mid+1;
            }
            
        }
        // Now start and ennd are pointing at the same position
        //  So nothing is left to be compared and we can return start and end 
        return start;
    }
}
