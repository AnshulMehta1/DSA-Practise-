class Solution {
    public int addDigits(int num) {
        
        int sum = 0;
        while (num != 0){
            
            sum = sum + num % 10; // Remainder
            num = num / 10; // Quotient
            
        }
        if (sum / 10 != 0){ 
            
            return addDigits(sum);  // Recursive Call
            
        }
        return sum;
    }
}
