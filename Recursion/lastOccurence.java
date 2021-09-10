import java.util.*;
import java.io.*;

public class lastOccurence {
    public static void main(String[] args) {

    }   
    public static int Last(int[] arr,int index,int x){
        int lastindexinsmallarray=Last(arr,index+1,x);
        if (lastindexinsmallarray==-1){
            if(arr[index]==x){
                return index;

            }
            else{
                return -1;
            }
        
        }
        else{
            return lastindexinsmallarray;
        }

    } 
}
