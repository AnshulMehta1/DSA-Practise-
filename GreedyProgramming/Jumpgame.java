class Solution {
    public boolean canJump(int[] arr) {
        if(arr.length==1) {
            return true;
        }
        int dist=0;
        int end=arr.length-1;
        for (int i=0;i<arr.length;i++){
            dist = Math.max(dist, arr[i]);
            if(dist==0 && i!=end){
                return false;
            } 
            dist--;

        }
        return true;
    }
}
