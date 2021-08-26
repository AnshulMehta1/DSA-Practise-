import java.util.*;
public class IntersectionArray {
    public static void main(String[] args){
        int[] arr={4,9,5};
        int[] arr1={9,4,9,8,4};
        int[] ans=Intersection(arr,arr1);
        System.out.println(Arrays.toString(ans));
    }
    public static int[] Intersection(int[] arr, int[] arr1){
        if (arr.length==0 || arr1.length==0){
            return new int[0];
        }
            
        int[] arri= new int[arr.length>arr1.length?arr1.length:arr1.length];
        //  Create an array with smaller size 
        Arrays.sort(arr);
        Arrays.sort(arr1);
        int p1=0;// Pointer for array 1 
        int p2=0; // Pointer for array 2 
        int pi=0; // Pointer for intersection wala array\
        while (p1<arr.length && p2<arr1.length){
            int e1=arr[p1];
            int e2=arr[p2];
            if (e1==e2){
                if (pi ==0 || arri[pi-1] != e1){
                    arri[pi++]=e1;  // Adding the element 
                }
            }
            else if (e1<e2){
                p1++;
            }
            else {
                p2++;
            }
        }


        return Arrays.copyOfRange(arri, 0, pi);
    }
    
}
