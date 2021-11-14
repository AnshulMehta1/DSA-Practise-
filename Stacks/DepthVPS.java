class Solution {
    public int maxDepth(String s) {
        // In short tya sudhi count javanu jya sudhi ek j side no ( paranthesis aavya raakhiye
        int start=0; // (
        int max=0;  // )
        for (int i=0; i<s.length();i++){
            
            if (s.charAt(i)=='('){
                start++;
                if(start>max){
                    max=start;
                }
            }
            else if (s.charAt(i)==')'){
                
                --start;
            }
        }
        return max;
    }
}

