import java.util.*;
import java.io.*;
public class oddEven {
    public static void main(String[] args){
        int n=98;
        boolean ans=isOdd(n);
        System.out.println(ans);

    }
    // Only the last bit in binary determines if it is odd or even
    public static boolean isOdd(int num){

        return (num & 1)==1; // Bitwise and kari check the last bit 
    }
}
