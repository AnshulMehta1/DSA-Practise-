import java.util.*;
class Solution {
    public int findContentChildren(int[] g, int[] s) {
        // at most one cookie
        Arrays.sort(g);
        Arrays.sort(s);
        int i=0; // Greed iterator 
        int j=0; // Size iterator
        int result=0;
        while (i<g.length && j<s.length){
            
            if (s[j]>=g[i]){
                i++;
                j++;
                result++;
                
            }
            else{
                j++; // Iterate for sizes
            }
        }
        // Greedy in the sense ke we'll start from smallest greed and reward kids with smaller
        // greed
        
        return result;
    }
}
