class Solution {
    public String reversePrefix(String word, char ch) {
        StringBuilder temp = new StringBuilder();
        boolean gotIt = false;
        int i = 0;
        while (i < word.length()) {
            temp.append((word.charAt(i)));
            if (word.charAt(i) == ch && !gotIt) {
                temp.reverse();
                gotIt = true;
            }
            ++i;
        }

        return temp.toString();
        
    }
}
