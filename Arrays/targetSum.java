import java.util.*;
// import java.io.*;
//  One indexed array 
// Target is given 

public class targetSum {
    public static void main(String[] args){
        int[] arr1={2,7,11,15};
        int target=9;
        int[] arr2={2,3,4};
        int target2=6;
        int[] ans=targetsum(arr1,target);
        System.out.println(Arrays.toString(ans));
        int[] ans2=targetsum(arr2,target2);
        System.out.println(Arrays.toString(ans2));
      
   }
 
   public static int ceiling(int[] arr,int target){
    int start=0; //  0th Index
    int end = arr.length-1; // Last Index
    while (start<end){
        int mid=(start+end)/2;
        if (target<arr[mid]){
            end=mid-1;
            // Remember that mid is an index itself 
            }
        else if (target>arr[mid]){
            start=mid+1;
            }
        else{
            return mid;
            }
        }
    //  In case none of  that works than we will here not return -1 but a number that is greater than target element
    
    return start;
    } 
    
    public static int[] targetsum(int[] arr,int target){
        int start=0;
        int index=ceiling(arr,target);
        int end=index;

        // Strategy- Check The Index of the Target and then search the left part for checking two element
        // Now we will use our pointer start and end to get the target 
        while (start<end){
            if (arr[start]+arr[end]==target){
                return new int[]{start+1,end+1};

            }
            else if (arr[start]+arr[end]>target){
                end=end-1;
            }
            else {
                start++;
            }
      
        }
        return arr;
    }


 
  
    
}
