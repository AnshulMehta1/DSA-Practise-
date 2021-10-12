import java.util.*;
import java.io.*;
public class NumberOfDigits {
   public static void main(String[] args){
    int n=3545;
    int base =3;
    int answer=numDigits(n,base);
    System.out.println(answer);

   } 
   public static int numDigits(int n,int base) {
        int ans = (int)(Math.log(n)/Math.log(base));
        ans=ans+1;
        return ans;
   }
}
