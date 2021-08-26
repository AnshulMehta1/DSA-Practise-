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

// class Solution {
//     public int[] intersection(int[] nums1, int[] nums2) {
//         int n=nums1.length;
//         int m=nums2.length;
//         Arrays.sort(nums1);
//         Arrays.sort(nums2);
//         ArrayList<Integer> list=new ArrayList<>();
//         int max=0;
//         int start=0;
//         int end=0;
//         while(start<nums1.length && end <nums2.length){
//             if(nums1[start]==nums2[end] && nums1[start]>max) {
//              max=nums1[start];
//              list.add(nums1[start]);
//              start++;
//              end++;
//          }
//          else if(nums1[start]>nums2[end])
//          {
//              end++;
//          }
//          else
//          {
//              start++;
//          }
//         }
//          int[] ans= new int[list.size()];
//          for(int i=0;i<list.size();i++){
//             ans[i]=list.get(i);
//     }
    
//     return ans;
        
//     }
// }
