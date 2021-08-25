

class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int sum1 = 0;
        int sum2 = 0;
        for(int i : aliceSizes)
            sum1 += i;
        for(int j : bobSizes){
            sum2 += j;
        }
        
        int sum = (sum1 - sum2)/2;
        int result[] = new int[2];
        for(int i : aliceSizes){
            for(int j : bobSizes){
                if(i == j+sum){
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }
        return result;
        
    }
}




