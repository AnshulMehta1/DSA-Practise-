import java.util.*;
import java.io.*;
public class binarySRecursive {

    public static void main(String[] args){
        int[] arr={1,2,3,4,5,6,7,8,9};
        int target=6;
        int ans=Binarysearch(arr,target,0,arr.length-1);
        System.out.println(ans);

    }
    public static int Binarysearch(int[] arr,int target,int start,int end){
        
      
        if(start>end){
            return -1;
            
        }
        int mid = start+(end-start)/2;
        if (arr[mid] == target){
                return mid;
            }

        else if (arr[mid]>target){
                int newe=mid-1;
                return Binarysearch(arr,target,start,newe);

            }
        else{
                int news=mid+1;
               
                return Binarysearch(arr,target,news,end);
            }

         
    }
}
