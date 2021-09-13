// I came across this question and it had me in splits
//  The game boils down to 4 stones and you need to leave your opponent with 4 stones in the end tto win
//  That is not possible when working with multiples of 4 and so on 4,8,12,16,20 the opponents win

class Solution {
    public boolean canWinNim(int n) {
        if (n%4==0){
            return false; 
        }
        else {
            return true;
            
        }
        
    }
}
