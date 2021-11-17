class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
          HashSet<Character> hs = new HashSet<Character>();
        for (char c : allowed.toCharArray())
            hs.add(c);
        int count = 0;
        for (String word : words)
            if (isConsistent(hs, word))
                count++;
        return count;
    }
    static boolean isConsistent(HashSet<Character> hs, String s) {
        for (char c : s.toCharArray())
            if (!hs.contains(c))
                return false;
        return true;
        
    }
}
