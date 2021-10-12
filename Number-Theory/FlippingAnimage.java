class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        // Reverse and Invert 
        // Invert by Bitwise EXOring
        for (int[] r: image){
            for (int i=0;i<(image[0].length+1)/2;i++){
                int temp=r[i];
                r[i]=r[image[0].length-i-1];
                r[image[0].length-i-1]=temp;
                
            }
        }
        for (int j=0;j<image.length;j++){
            for (int k=0;k<image[j].length;k++){
                image[j][k]^=1;
            }
        }
        
       
        
        return image;
    }
}
