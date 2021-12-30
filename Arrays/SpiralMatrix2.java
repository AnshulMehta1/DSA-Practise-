class Solution {
    public int[][] generateMatrix(int n) {
        int[][] mat=new int[n][n];
        int minrow=0;
        int maxrow=n-1;
        int mincol=0;
        int maxcol=n-1;
        int count=1;
        // For n*n Matrix
        while(count<=n*n){
            // Iterating the Col
            for (int i=mincol;i<=maxcol && count<=n*n;i++){
                mat[minrow][i]=count;
                count++;
            }
            minrow++;
            // Iterating the Row
            for (int i=minrow;i<=maxrow && count<=n*n;i++){
                mat[i][maxcol]=count;
                count++;
            }
            maxcol--;
            for (int i=maxcol;i>=mincol && count<=n*n;i--){
                mat[maxrow][i]=count;
                count++;
            }
            maxrow--;
            for (int i=maxrow;i>=minrow && count<=n*n;i--){
                mat[i][mincol]=count;
                count++;
            }
            mincol++;
            
        }
        
        return mat;   
    }
}
