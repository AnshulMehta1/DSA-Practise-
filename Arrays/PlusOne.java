class Solution {
    public int[] plusOne(int[] digits) {
        boolean increase = true;
        for (int i = digits.length - 1; i >= 0; i--) {
            if (increase) {
                increase = false;
                if (digits[i] == 9) {
                    digits[i] = 0;
                    increase = true;
                } 
                else {
                    digits[i]++;
                }
            }
        }
        if (increase==true) {
            
            digits[0] = 1;
            return Arrays.copyOf(digits, digits.length + 1);
        } 
        else {
            return digits;
        
        }
}
}
