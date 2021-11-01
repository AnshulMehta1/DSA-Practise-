class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int n = nums.length -1;
        int i = 0;
        while(i < n){
            if(nums[i]%2 != 0){
                swap(nums,i,n);
                n--;
            }
            else{
                i++;
            }
         
        }
        return nums; 
    }
    
    public void swap(int[] arr, int a, int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
      
}
