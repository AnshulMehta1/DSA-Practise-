import java.util.*;
public class   MaximumProductsubArray {

    public static void main(String[] args) {

    }
    public int maximumProduct(int[] arr) {
        int len=arr.length;
        int max=arr.length-1;
        if (len<3){
            return 0;
        }
        else if(len==3){
            return arr[0]*arr[1]*arr[2];
        }
        else{
            Arrays.sort(arr);
//             For negative numbers a smaller product is favorable so check that as well
            int Pproduct=arr[max]*arr[max-1]*arr[max-2];
            int Nproduct=arr[0]*arr[1]*arr[max]; // May not be necessarily negative but can be a check 
            int product= Math.max(Pproduct, Nproduct);
            return product;
            
        }
       
        
    }
}