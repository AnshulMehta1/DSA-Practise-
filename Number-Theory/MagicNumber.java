import java.util.*;
import java.io.*;
public class MagicNumber {
    public static void main(String[] args){
        int n=6;
        int ans=magicNumber(n);
        System.out.println(ans);

    }
    public static int magicNumber(int n){
        int ans=0;
        int base=5;
        while(n>0){
            int last=n&1; //gives the digit;
            n=n>>1; // Right Shift 
            ans+=last*base; // Adding the Result
            base*=5;
        }
        return ans;

    }
}
