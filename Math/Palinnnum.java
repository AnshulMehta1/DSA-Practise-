class Solution {
    public boolean isPalindrome(int x) {
        int num = x;
        int d=0;
//         Reconstructing the Number Backwards 
        while(num > 0){
            int rem = num % 10;
            d = d * 10 + rem;
            num = num / 10;
        }
        if(x==d){
            return true;
        }
        else{
            return false;
        }

        
    }
}
