import java.util.*;
import java.io.*;
public class NumevenDigits {
    public static void main(String[] args){

    }
    public static int Num(int[] arr){
        int counter=0;
        int start = 0;
        int end=arr.length-1;
        for (int i=0;i<arr.length; i++){
            int number=Digits(arr[i]);
            if (number%2==0){
                counter++;
            }

        }
        return counter;
    }
    public static int Digits(int num){
        int count=0;
        while (num != 0) {
            // num = num/10
            num /= 10;
            ++count;
          }
          return count;
    }
    
}
