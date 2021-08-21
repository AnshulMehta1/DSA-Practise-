import java.util.*;
import java.io.*;
public class LinearSearch {
    public static void main(String[] args){
        int[] arr={23,56,45,12,9,88,99,74,66,33};
        int target=77;
        int ans=linearSearch(arr,target);
        boolean ans3=linearSearch3(arr,target);
        System.out.println(ans);
        System.out.println(ans3);

    }
    // public static boolean isLinearSearch(int[] arr, int ele){

    //     int counter=0;
    //     for (int j=0;j<arr.length;j++){
    //         if(arr[j]==ele){
    //             counter++;
    //             return true;
            
    //         }
    //     }
    //     return true;
    // }
    public static int linearSearch(int[] arr,int ele){
        int counter=0;
        if (arr.length==0){
            return -1;
        }
        for (int i=0;i<arr.length;i++){
            //  Check for elemnet == target element
            int element=arr[i];
            if (element==ele){
                counter++;
                return i;
            } 

            
           
        }
        // return for no matching element 
        return -1;
    }
    public static int linearSearch2(int[] arr,int ele){
       
        if (arr.length==0){
            return -1;
        }
        for (int element:arr) {
            if (element==ele){
                return element;
            }
        }
        
        // return for no matching element 
        return -1;
    }

    public static boolean linearSearch3(int[] arr,int ele){
        
        if (arr.length==0){
            return false;
        }
        for (int i=0;i<arr.length;i++){
            //  Check for elemnet == target element
            int element=arr[i];
            if (element==ele){
              
                return true;
            } 
           
        }
        // return for no matching element 
        return false;
    }

}
