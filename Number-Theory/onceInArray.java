import java.util.*;
import java.io.*;

public class onceInArray {
    public static void main(String[] args) {
        int[] arr={2,3,4,1,2,1,3,6,4};
        int answer=IsOne(arr);
        System.out.println(answer);


    }
    public static int IsOne(int[] arr){
        
        int unique=0;
        // Now we skip 2 and check if the subsequent element is matching
        for (int n: arr){
            unique^=n;

        }

        return unique;
    }
}
