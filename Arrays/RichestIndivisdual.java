class Solution {
    public int maximumWealth(int[][] accounts) {
        int max=0;
        for (int i=0;i<accounts.length;i++){
            int sumOfI=0;
            for (int j=0; j<accounts[i].length;j++){
                sumOfI=sumOfI+accounts[i][j];
                
            }
            if (sumOfI>max){
                max=sumOfI;
            }
            
        }
        return max ;
    }
}
