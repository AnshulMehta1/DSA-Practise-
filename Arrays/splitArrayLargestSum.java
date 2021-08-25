import java.util.*;
import java.io.*;
//  There is binay search being used in the question
public class splitArrayLargestSum {
    public static void main(String[] args){
        int[] arr={7,2,5,10,8};
        int m=2;
        int ans =splitArray(arr, m);
        System.out.println(ans);

    }
    public  static int splitArray(int[] arr, int m){
        // Our array have exact m elements
        Arrays.sort(arr);
        //  Sorting the array 
        int start=0;
        int end=0;
        for(int i = 0 ; i < arr.length ; i++) {
			start = Math.max(start, arr[i]);
			end += arr[i];
		}
        while (start<end){
            // Condition for breaking the looop
            int mid=start+(end-start)/2; // 16 
            int sum=0;
            int pieces =1;
            //  Initially 1 che we will take it till m 
            for(int values : arr) {
				if(sum + values > mid) { // 22,18
					sum = values;  // sum=10, sum 8
					pieces++;  // pieces=1, pieces =2
				}else {
					//just add some if the above condition doesn't satisfy
					sum += values; // 7,2,5
				}
			}
            	//here we check if the pieces is greater than m than we know that it should not be our ans so just increment start with mid+1
			if(pieces > m) {
				start = mid + 1;
			}else {//in this condition if the pieces are smaller than and equal to m so this could be our possible ans so we make end = mid not end = mid-1
				end = mid;
			}
        }
        return end ;

    }
    
}
