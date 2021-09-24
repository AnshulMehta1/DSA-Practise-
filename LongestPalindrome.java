class Solution {
    public int longestPalindrome(String s) {
         
        int counter = 0;
        int[] frequency = new int[256];

        for (char c : s.toCharArray()) {
            frequency[c]++;
        }
        // The number of times that haracter appears

        for (int i = 0; i < frequency.length; i++) {
            
            if (frequency[i] > 1) {
                if (frequency[i] % 2 != 0) {
                    frequency[i]--;
                }
                counter += frequency[i];
            }
        }
        if (counter < s.length()) {
            counter++;
        }
        return counter;
        
    }
}
