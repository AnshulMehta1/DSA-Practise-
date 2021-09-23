class Solution {
    public boolean lemonadeChange(int[] bills) {
//         Denominations allowed 5,10,20
//         Initially no change
        int n5=0;
        int n10=0;
        // Dont need to keep a track of 20 $ Bills as e koine deva na pade
        if (bills[0]!=5){
            return false;
        }
        else {
            for (int i=0;i<bills.length;i++){
                if (bills[i]==10){
                    if(n5>=1){
                        n5--; 
                        n10++;
                    }
                    else {
                        return false;
                    }
                  
                }
                else if(bills[i]==20){
                    if (n10>=1){
                        n10--;
                    }
                    else if (n5>=3){
                        n5=n5-2;
                    }
                    else {
                        return false;
                    }
                }
                else{
                    n5++;
                }
                
            }
            
        }
        return true;
    }
}
