import java.util.*;
import java.io.*;
public class maxofArray {
    public static void main(String[] args) {
        int[] array = new int[10]; 
        // int[] array = {1,2,3,4,5,6,7,8,9,10};
        // Making a scanner
        Scanner sc = new Scanner(System.in);
        for (int i=0;i<array.length;i++){
            array[i]=sc.nextInt();
            
        }
        System.out.println(max(array));
        sc.close();

    }
    public static int max(int[] arr){
        int max = arr[0];
        for (int j=0;j<arr.length;j++){
            if (arr[j]>max){
                max=arr[j];
            }
        }     
        return max;    
    }
 
}
