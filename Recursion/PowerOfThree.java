class Solution {
    public boolean isPowerOfThree(int n) {
        if(n==1 || n==3){
           return true;
       }
        if(n==0){
            return false;
        }
        if(n%3!=0){
            return false;
        }
        else{
            boolean ans=isPowerOfThree(n/3);
            return ans;
        }
        
    }
}
