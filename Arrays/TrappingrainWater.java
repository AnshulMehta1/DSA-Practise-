class Solution {
    public int trap(int[] height) {
        int maxIndex=0;
        int n=height.length;
        // Find the Maximum Index
        for (int i=0;i<n;i++){
            if (height[maxIndex]<height[i]){
                maxIndex=i;    
            }
            
        }
        // Similar to the  maximum water Problem
        int max=0;
        int water=0;
        for(int i=0;i<maxIndex;i++){
            if(max<height[i]){
                max=height[i];
            }
            else if(height[i]<max){
                water=water + (max-height[i]);
            }
        }
        // Initilizing to zero to check the other siide of max Index
        max=0;
        for (int i=n-1;i>maxIndex;i--){
             if(max<height[i]){
                max=height[i];
            }
            else if(height[i]<max){
                water=water + (max-height[i]);
            }
            
            
        }
        return water;
        
    }
}

  
