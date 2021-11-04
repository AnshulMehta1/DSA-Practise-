
      
class Solution {
    public int subtractProductAndSum(int n) {
         
        int temp = n;
        int sum = 0;
        int product = 1;
        int ans;
        while(temp != 0){
            sum = sum+(temp%10);
            product = product*(temp%10);
            temp = temp/10;  
        }
        ans=product-sum;
        return ans;  
    }
}
