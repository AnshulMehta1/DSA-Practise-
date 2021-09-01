import java.util.*;
import java.io.*;
public class factorial {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int f=factorial(a);
        System.out.println(f);

    }
    static int factorial(int n)
    {
        if (n == 0)
          return 1;
          
        return n*factorial(n-1);
    }
      
}
