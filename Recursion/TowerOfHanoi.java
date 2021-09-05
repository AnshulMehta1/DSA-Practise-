import java.util.*;
import java.io.*;
public class TowerOfHanoi {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int Disc=sc.nextInt();
        int source=sc.nextInt();
        int destination=sc.nextInt();
        int helper=sc.nextInt();
        Instructions(Disc, source, destination, helper);

    }
    public static void Instructions(int n, int source,int target, int mid){
        if (n==0){
            return;
        }
        Instructions(n-1,source,mid,target);
        System.out.println(n +"th Disc from"+ source + "to" + target );
        Instructions(n-1,mid,target,source);

    }
}
