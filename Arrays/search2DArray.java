import java.util.*;
import java.io.*;
public class search2DArray {
    public static void main(String[] args) {
        int[][] arr= {
            {12,56,77,9},
            {18,27,36},
            {1,88,99,93,69}
        };
        int target1=99;
        int target2=87;
        boolean ans1=search2D(arr,target1);
        boolean ans2=search2D(arr,target2);
        System.out.println(ans1);
        System.out.println(ans2);

    }
    public static boolean search2D(int[][] arr, int target){
        for (int r=0; r<arr.length; r++){
            for (int c=0; c<arr[r].length; c++){
                if(arr[r][c]==target){
                    return true;
                }
            }
        }
        return false;
    }
}
