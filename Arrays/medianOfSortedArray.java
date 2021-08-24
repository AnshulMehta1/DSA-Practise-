import java.util.*;
import java.io.*;
public class medianOfSortedArray {
    public static void main(String[] args){
        int ar1[] = { 1,2 };
        int ar2[] = { 3,4};
 
    System.out.println(Median(ar1, ar2));

    }
    public static int Median(int[] arr1, int[] arr2){
        int i=0;
        int j=0;
        int size1=arr1.length; //n 
        int size2=arr2.length; // m
        //  Current Indices
        int counter;
        int a1=-1;
        int a2=-1;
        //  Odd and Even Two cases can arise here
        // If n+m is odd then n+m / 2
        if ((size1+size2)%2==1){
            for(counter = 0;counter <= (size1 + size2) / 2;counter++){
                if(i!=size1 && j!=size2){
                    a1=(arr1[i] > arr2[j]) ? arr2[j++] : arr1[i++];
                }
                else if (i < size1){
                    a1 = arr1[i++];
                }
                else{
                    a1=arr2[j++];
                }
            }
            return a1;

        
        }
        else{
            for(counter = 0;counter <= (size1 + size2) / 2;counter++){
                a2=a1;
                if(i!=size1 && j!=size2){
                    a1=(arr1[i] > arr2[j]) ? arr2[j++] : arr1[i++];
                }
                else if (i < size1){
                    a1 = arr1[i++];
                }
                else{
                    a1=arr2[j++];
                }
            }
            return (a1+a2)/2;

        }
        // return 1;

    }
}
