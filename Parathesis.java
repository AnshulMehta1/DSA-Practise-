class Solution {
    public boolean isValid(String s) {
            LinkedList<Character> stack = new LinkedList<>();
        for(char c : s.toCharArray()) {
            switch(c) {
                case '(':
                case '{':
                case '[':
                    stack.push(c);
                    break;
                case ')':
                case '}':
                case ']':
                    if (stack.isEmpty()) return false;
                    //All matching brackets are close in character table
                    //Difference between their indexes should be either 1 or 2
                    int diff = c - stack.pop();
                    if (diff != 1 && diff != 2) return false; //If it is not 1 or 2 breakets are different
            }
        }
        return stack.isEmpty();
        
    }
}
