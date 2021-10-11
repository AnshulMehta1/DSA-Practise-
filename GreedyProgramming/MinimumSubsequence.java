import java.util.Arrays;
import java.util.Collections;
class Solution {
    public List<Integer> minSubsequence(int[] nums) {
        // Sort the Array
        // Arrays.sort(nums, Collections.reverseOrder());
        Arrays.sort(nums);
        int end=nums.length-1;
        int sum=0;
        int remsum=0;
        List<Integer> result=new ArrayList<Integer>();
        for (int j=0;j<nums.length;j++){
            remsum+=nums[j];
        }
        for (int i=0;i<nums.length;i++){
            sum=sum+nums[i];
          
            if (sum<=remsum){
                result.add(nums[end]);
                end=end-1;
            }
            remsum-=nums[i];
            
        }
        return result;
    }
   

    public void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
    
}
