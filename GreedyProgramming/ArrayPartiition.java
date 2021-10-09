class Solution {
    public int arrayPairSum(int[] nums) {
         int sum = 0;
  // Sorting using inbuilt arrays of Java  
    Arrays.sort(nums);
    for (int i = 0; i < nums.length; i+=2) {
      sum += nums[i];
    }
    return sum;
        
    }
}
