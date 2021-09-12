class Solution {
    public int mod = 1_000_000_007;
//     Answer is to be returned with modulo 10^7
    public int minNonZeroProduct(int p) {
        
        if (p == 1) {
            return 1;
        }
        long max = (long)(Math.pow(2, p)) - 1; // The max 
        long sum = max - 1; 
        long n = sum/2; 
        long sumf = rec(sm, n); // recursive call 
        
        return (int)(sumf * (max % mod) % mod); 
    }
    
    public long rec(long val, long n) {
        if (n == 0){
            return 1;
        } 
        if (n == 1){
            return (val % mod);
        } 
        
        long newVal = ((val % mod) * (val % mod)) % mod;
        
        if (n % 2 != 0) {
            return ((rec(newVal, n/2) % mod) * (val % mod)) % mod;
        }
        
        return rec(newVal, n/2) % mod;
        
    }
}
