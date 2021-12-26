class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        
        String[] morseCode = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};
    Set<String> set = new HashSet<>();

    for (String word: words) {
      StringBuilder temp = new StringBuilder();
      for (char c: word.toCharArray()) {
          
        temp.append(morseCode[c - 'a']);
      }
      set.add(temp.toString());
    }

    return set.size();
        
    }
}
