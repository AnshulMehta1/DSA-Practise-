class Solution {
    public int[][] transpose(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
         int[][] tmatrix=new int[n][m];
        // Constructing a matrix 
        for (int i=0; i<n; i++){
            for (int j=0; j<m; j++){
                tmatrix[i][j]=matrix[j][i];
            }
        }

        return tmatrix;
        
    }
}
