import java.io.*;
import java.util.*;
public class maxWealth {
    public static void main(String[] args) {

        // int[] arr={1,2,3,4,5,6,7,8,9,10};
        // System.out.println(sumArrayelems(arr));
        int[][] arr2= {
            {12,56,77,9},
            {18,227,36},
            {18,29,33,69}
        };
        int ans=maxWealthcalc(arr2);
        System.out.println(ans);

    }
    public static int sumArrayelems(int[] arr){
        int sum=0;
        for (int i=0;i<arr.length;i++){
            sum=sum+arr[i];
        }
        return sum;
    }
    public static int maxWealthcalc(int[][] arr){
        // We will return the index of the richest person
        int max=Integer.MIN_VALUE;
        int mostWealthyMan=0;
        // Initializing it to  almost - infinite
        for (int[] row:arr){
            
            if(sumArrayelems(row)>max){
                max=sumArrayelems(row);
                mostWealthyMan++;
            }
        }

        return mostWealthyMan;
    }
    
}
