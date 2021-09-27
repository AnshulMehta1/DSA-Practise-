
class Solution {
    public String longestCommonPrefix(String[] str) {
        
        String prefix = str[0];
        for(int index=1;index<str.length;index++){
            // Checks the index for each element if it is equal to prefix
            while(str[index].indexOf(prefix) != 0){
                // If true then add to the substring
                prefix=prefix.substring(0,prefix.length()-1);
            }
        }
        return prefix;
        
        
    }
}
