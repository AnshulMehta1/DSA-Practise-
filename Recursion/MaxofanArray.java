import java.util.*;
import java.io.*;
public class MaxofanArray {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[] arr={1,2,3,4,5,6,7,8,9,10};
        sc.close();
        int ans=Max(arr,0);
        System.out.println(ans);

    }
    public static int Max(int[] arr, int index){
        if (index==arr.length-1){
            return arr[index];
        }
        int misa=Max(arr,index+1);
        if(misa>arr[index]){
            return misa;
        }
        else{
            return arr[index];
        }
      
        // Index 0 thi j karvani che
      

    }
    
    
}
