class Solution {
    public static void main(String[] args) {
        
    }
    public int myAtoi(String s) {
        long num=0;
        int sign = 1,flagChar=0,flagSign=0;
        for(int i=0; i<s.length();i++){
            if(s.charAt(i) == '-'&&flagSign==0){
                sign = -1;
                 flagSign=1;
                flagChar=1;
                continue;
            }
            else if(s.charAt(i) == '+'&&flagSign==0){
                sign = 1;
                 flagSign=1;
                flagChar=1;
                continue;
            }
            else if(s.charAt(i) == ' '&&flagChar==0){
                continue;
            }
            else if(s.charAt(i)>='0' &&s.charAt(i)<='9'){
                num = 10*num + ((int)s.charAt(i) - 48);
                 if(num*sign>=Integer.MAX_VALUE) {
                    return Integer.MAX_VALUE;
                }
                else if(num*sign<=Integer.MIN_VALUE) {
                    return Integer.MIN_VALUE;
                }
                 flagSign=1;
                flagChar=1;
            }    
            else break;
        }
        return (int)num*sign;
    }
}