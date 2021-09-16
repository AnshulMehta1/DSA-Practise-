class Solution {
    public int fib(int n) {
        int start=0;
        int Fib;
        if (n==0){
            return 0;
        }
        if (n==1){
            return 1;
        }
        Fib=fib(n-1)+fib(n-2);
        return Fib;
        
    }
}
