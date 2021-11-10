class Solution {
    public int minCostToMoveChips(int[] position) {
        int countE=0;
        int countO=0;
        int n=position.length;
        for(int i=0;i<n;i++){
            if(position[i]%2==0){
             countE++;   
            }
            
            else {
             countO++;   
            }
        }
        return Math.min(countO,countE);
    }
}
