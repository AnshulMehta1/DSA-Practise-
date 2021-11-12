class Solution {
    public int largestPerimeter(int[] nums) {
        int mxp=0;
         // Sort the Array to get the max length
        Arrays.sort(nums);
        int n=nums.length;
       
       
        for (int i=n-1;i>1;i--){
             // Place a check for the triangle
            if(nums[i]<nums[i-1]+nums[i-2]){
               mxp=nums[i]+nums[i-1]+nums[i-2]; 
                return mxp;
            }
        }
        
        return 0;
        
    }
}
