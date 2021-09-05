import java.util.*;
public class dispArrayReverse {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[] arr={1,2,3,4,5,6,7,8,9,10};
        sc.close();
        DispReverse(arr,0);

    }
    public static void DispReverse(int[] arr, int index){
        if (arr.length==index){
            return;
        }
        // Index 0 thi j karvani che
        DispReverse(arr,index+1);
        System.out.println(arr[index]);

    }
    
}
