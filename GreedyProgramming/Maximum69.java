class Solution {
    public int maximum69Number (int num) {
        // Maximum number by changing at most 1 digit 
        // Heirarchy - 1st,2nd 3rd and so on wherever find 6 replace with lower positioned 9
        String str = num+""; // Converting to string with no spaces
        
        StringBuilder sb = new StringBuilder();
        int changeCount=0;
        boolean changed = false;
        for (char ch : str.toCharArray()) {
            if (changeCount==0 && ch == '6') {
                sb.append('9');
                changeCount++;
            }
            else {
                sb.append(ch);
            }
        }
        return Integer.parseInt(sb.toString());
        
    }
}
