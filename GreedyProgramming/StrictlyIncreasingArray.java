class Solution {
    public int minOperations(int[] arr) {
        //o Indexed arr
        if (arr.length==1){
            return 0;
        }
        int Counter=0;
        for (int i=1;i<arr.length;i++){
            if (arr[i]<=arr[i-1]){
               
                 Counter+=arr[i-1]-arr[i]+1;
                 arr[i]=arr[i-1]+1;
            }
        }
        
        return Counter;
        
        
    }
}

