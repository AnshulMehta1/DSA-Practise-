class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
       // Solution using Hashmap
        int len1=nums1.length;
        int len2=nums2.length;
        int[] result= new int[len1];
         HashMap<Integer,Integer> map= new HashMap<Integer,Integer>();
        for (int i=0;i<len2;i++){
            for(int j=i+1;j<len2;j++){
                if (nums2[j]>nums2[i]){
                    map.put(nums2[i],nums2[j]);
                    break;
                }
            }
        }
        
        for( int i=0;i<len1;i++)
             result[i]=map.getOrDefault(nums1[i],-1);          
       return result;
    }
}

   
