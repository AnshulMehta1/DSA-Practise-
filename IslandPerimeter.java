class Solution {
    public int islandPerimeter(int[][] grid) {
        int i=0;
        int j=0;
        int m = grid.length;
        int n = grid[0].length;
        int perimeter = 0;
        for(i = 0;i < m;i++) {
            for(j = 0;j < n;j++) {
                if(grid[i][j] == 1) {
                    if(i < 1 || grid[i-1][j] != 1){
                        perimeter++;
                    } 
                    if(j < 1 || grid[i][j-1] != 1) {
                        perimeter++;
                    }
                    if(j >= grid[0].length-1 || grid[i][j+1] != 1) {
                        perimeter++;
                    }
                    if(i >= grid.length-1 || grid[i+1][j] != 1){
                        perimeter++;
                    } 
                }
            }
        }
        return perimeter;
        
    }
}
