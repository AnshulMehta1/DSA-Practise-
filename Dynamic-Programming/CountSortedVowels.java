class Solution {
    public int countVowelStrings(int n) {
         return find(0, n, 0);
        
    }
     public int find(int lastIndex, int n, int count)
    {
        if(count == n)
            return 1;
        
        int ans = 0;
        for(int i=lastIndex;i<5;i++)
        {
            ans += find(i, n, count+1);
        }
        return ans;
    }
}
