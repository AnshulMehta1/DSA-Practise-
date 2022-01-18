class Solution {
    public int projectionArea(int[][] grid) {
         int top = 0, front = 0, side = 0, rowMax = 0, colMax = 0;
        
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                top += grid[i][j] == 0 ? 0 : 1;
                rowMax = Integer.max(rowMax, grid[i][j]);
                colMax = Integer.max(colMax, grid[j][i]);
            }
            side += rowMax;
            rowMax = 0;
            
            front += colMax;
            colMax = 0;
        }
        return side + top + fron;
    }
}
