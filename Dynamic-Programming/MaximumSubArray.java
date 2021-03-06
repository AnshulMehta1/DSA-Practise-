class Solution {
    public int maxSubArray(int[] arr) {
         int maxSum = arr[0];
        int currentSum = arr[0];
        for(int i = 1; i < arr.length; i++){
            currentSum = Math.max(arr[i] + currentSum, arr[i]);
            maxSum = Math.max(currentSum, maxSum);
        }
        return maxSum;
        
        
    }
}
