import java.io.*;
import java.util.*;
public class evendigits {
    public static void main(String[] args){
        // System.out.println(NumberofDigits(693));
        int[] arr={27,56,45,12,9,8,99,747,66,333};
        int ans=isEven(arr);
        System.out.println(ans);

    }
    public static int NumberofDigits(int num){
        int length = (int) (Math.log10(num) + 1);
        return length;
    }
    //  Second way to count the number of digits 
    public static int countDig(int num){
        int counter=0;
        while (num>0){
            counter++;
            num=num/10;

        }
        return counter;
    }
    public static int isEven(int[] arr){
        int counter=0;
        for (int i=0; i<arr.length; i++){
            if(NumberofDigits(arr[i])%2==0){
                counter++;
            }
        }
        return counter;
    }

    
}
