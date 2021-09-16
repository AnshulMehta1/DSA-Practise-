class Solution {
    public boolean isPowerOfTwo(int n) {
//        Power of two che ke e check karvano che 
        if (n==0){
            return false;
        }
        if (n==1){
            return true;
        }
        if (n%2!=0){
            return false;
        }
        
        return (n>0 &&(isPowerOfTwo(n/2)));
           
      
        
    }
}
