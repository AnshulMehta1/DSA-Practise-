class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        
        if (jewels.length() < 1 || stones.length() < 1) return 0;
        
		char[] jewel = jewels.toCharArray();
		char[] stone = stones.toCharArray();
		int result = 0;
		int[] freq = new int[123]; // Frequency Array
		for(char c : stone)
			freq[c]++;
		for(char c : jewel){
			if(freq[c] > 0){
                result += freq[c];  
            } 
		}
		return result;
        
    }
}
