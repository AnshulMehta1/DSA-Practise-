class Solution {
    public int mySqrt(int x) {
         if (x == 0) {
           return 0;   
         }
        int sqrt = -1;
        // Two Pointer Binary Search Method
        int p1 = 0, p2 = x;
        // Termination Condition when p1>p2
        while(p1 <= p2) {
            int mid = (p1 + p2) / 2;
            
            if (mid > 0 && mid <= x / mid) {
                sqrt = mid;
                p1 = mid + 1;
            }
            else {
                p2 = mid - 1;
            }
        }
        
        return sqrt == - 1? x: sqrt;
        
    }
}
