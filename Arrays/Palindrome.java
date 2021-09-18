class Solution {
    public boolean isPalindrome(int x) {
//         Solving With converting it to string
        ArrayList<Integer> digits=new ArrayList<Integer>();
        int a=0;
         while(x > 0)
        {
            a = x % 10;
            digits.add(a);
            x = x / 10;
            
        }
        int n=digits.size();
  // After adding them to the list simply check the list from starting to end
        for (int i=0;i<digits.size();i++){
            if (digits.get(i)==digits.get(n-1-i)){
                return true;
            }
            else {
                return false;
            }
        }
        
        return false;
        
    }
}
