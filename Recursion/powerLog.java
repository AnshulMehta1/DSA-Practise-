import java.util.*;
import java.io.*;
public class powerLog {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int x=sc.nextInt();
        int n=sc.nextInt();
        int xrn = power(x,n);
        System.out.println(xrn);

    }
    public static int power (int x, int n){
        if (n==0){
            return 1;
        }
        int xpnd2 =power(x,n/2);
        int xpn=xpnd2*xpnd2;
        if (n%2==1){
             xpn=xpn*x;

        }
        return xpn;

    }

    
}
