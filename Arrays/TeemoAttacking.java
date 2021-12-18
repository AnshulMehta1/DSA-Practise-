class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        int ans=0;
        int size=timeSeries.length;
        int end=-1;
        // Enhanced for loop
        for(int series:timeSeries){
            ans+=duration;
            if(series<=end){
                ans-=end-series+1;
            }
            else{
                end=series+duration-1;
            }
        }
        return ans;
        
    }
}



