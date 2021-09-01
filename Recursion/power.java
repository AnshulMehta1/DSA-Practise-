import java.util.*;
import java.io.*;
public class power {
    public static void main(String[] args){
        int base = 3;
        int powerRaised = 4;
        int result = power(base, powerRaised);
        System.out.println(result);

    }

 class Solution {
    public double myPow(double x, int n) {
         if (x==0){
            return 0; // 0 waalo edge case
        }
        else if (n>=0){
            return pow1(x,n); // Simple case 
        }
        else{
           return pow1(1/x,n); //will return 1/x^n
                                // ahiya 1/n athva -n e walo edge case pan cover thai jase
        }
        
        
    }
  // aa aapdu recursive function
    public double pow1(double x,int n){
        if(n==0){
            return 1;
        }
        else if(n%2==0){
            double a= pow1(x,n/2); ///
            return a*a;
        }else{
            double a=pow1(x,n/2);
            return x*a*a;
        }
    
        
    }
}
}
