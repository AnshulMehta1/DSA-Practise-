import java.util.*;
// import java.io.*;
public class displayArray {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[] arr={1,2,3,4,5,6,7,8,9,10};
        sc.close();
        Disp(arr,0);

    }
    public static void Disp(int[] arr, int index){
        if (arr.length==index){
            return;
        }
        System.out.println(arr[index]);
        Disp(arr,index+1);

    }
}
