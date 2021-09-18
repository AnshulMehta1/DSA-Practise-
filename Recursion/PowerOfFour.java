class Solution {
    public boolean isPowerOfFour(int n) {
         if(n == 1 || n == 4){
            return true; // Base Case
        }
        else if(n == 0 || n%4 != 0){
            return false; // Break Condition
        } 
        else {
            return isPowerOfFour(n/4); // Recursive Call
        } 
        
    }
}
