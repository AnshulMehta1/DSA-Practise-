class Solution {
    public int countGoodSubstrings(String s) {
         if(s.length() < 3) return 0;
        int ans = 0;
        int i = 2;
        while (i < s.length()) {
            if(s.charAt(i) != s.charAt(i - 1) && s.charAt(i - 1) != s.charAt(i-2) &&                                s.charAt(i) != s.charAt(i - 2)) {
                ans++;
            }
            i++;
        }
        return ans;
        
    }
}
