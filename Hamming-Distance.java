class Solution {
    public int hammingDistance(int x, int y) {
        int ham = x ^ y;
        int count=0;
        while(ham!=0)
        {
            ham = ham & (ham-1);
            count++;
        }
        return count;
        
    }
}
