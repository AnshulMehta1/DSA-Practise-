import java.io.*;
import java.util.*;
public class containerMostWater {
    public static void main(String[] args) {
        int[] arr={1,8,6,2,5,4,8,3,7};
        int ans=MaxWater(arr);
        System.out.println(ans);

    }
    public static int MaxWater(int[] height) {
        int start=0; // First Index
        int end=height.length-1; // Last Index
        int max=0;
        //  Termination condition will be when start = end i.e. both pointers are equal 
        while (start<end){
            if (maxcalc(height[start],height[end],start,end)>max){
                max=maxcalc(height[start],height[end],start,end);
            }
           
            if (height[start]<=height[end]){
                    start++;
            }
            else{
                    end--;
            }
            

        }
        return max;
    }
    public static int maxcalc(int h1, int h2, int i1, int i2){
        int area=Math.min(h1,h2)*(i2-i1);
        return area;
    }
}
