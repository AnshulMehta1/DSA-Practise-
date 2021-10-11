class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        //2-D Array woth dim nx2 and each row has number of boxes of that type and number of units that can be accomodated
        // Maximum number of boxes that can be loaded on the truck --> trucksize
        int max=0;
        Arrays.sort(boxTypes,(a,b)->Integer.compare(b[1],a[1]));
        for (int i=0;i<boxTypes.length;i++){
            int[] load=boxTypes[i];
            if(truckSize<load[0]){  // If Remaining truck size can accomodate the box
                
                max=max+truckSize*load[1]; // Remaining truck size * units
                break;
                // This block is for partial loading 
            }
            max=max+load[0]*load[1];
            truckSize-=load[0];
        } 
        return max;
    }
    
}


