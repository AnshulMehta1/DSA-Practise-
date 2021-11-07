class Solution {
    public int findTheWinner(int n, int k) {
        int ans=recurse(n, k);
        return ans+1;
        
    }
    
    public int recurse(int n,int k){
        int result;
        if (n==1){
            return 0;
        }
        else {
            // Recursive Call
            result=recurse(n-1,k);
            result=(result+k)%n;
            return result;
        }
    }
}


