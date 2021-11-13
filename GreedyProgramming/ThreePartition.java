class Solution {
    public boolean canThreePartsEqualSum(int[] arr) {
        int sum = 0;
        int tempSum = 0;
        int count = 0;
        // Enhanced for Loop to calculate the sum
        for (int i=0;i<arr.length;i++) {
            
            sum += arr[i];
        }
        // Initial check to see if the sum is divisible by 3
        if (sum % 3 != 0) {
            return false;
        }
        
        for (int i = 0; i < arr.length; i++) {
            tempSum += arr[i];
            if (tempSum == sum / 3) {
                tempSum = 0;
                count++;
                if (count == 3) {
                    break;
                }
            }
        }
        if(count==3){
            return true;
        }
        else{
            return false;
        }

  
    }
}
