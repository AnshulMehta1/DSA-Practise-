class Solution {
    public boolean isAnagram(String s, String t) {
    if(s.length() != t.length()){
        return false; // Length j equal na hoy to directly false 
    }
    
    int[] countFreq = new int[26];
    
//         Idea is 26 maathi je je chars malta jaay e position ne increment karta javanu
    for(char ch : s.toCharArray()){
        countFreq[ch - 'a']++;
//         a-a --> 0 
    }
    
       // T maate same array ne aapde decrease karta javanu  
        
    for(char ch : t.toCharArray()){
        countFreq[ch - 'a']--;
    }
        
        // Etle jo same number os characters used hoy to array 0 thai javi joiye 
    
    for(int i = 0; i < 26; i++){
        if(countFreq[i] != 0){
            return false;
        }
    }
    
    return true;

        
    }
}
