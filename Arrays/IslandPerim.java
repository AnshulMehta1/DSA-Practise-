private int row = 0;
    private int col = 0;

    private int[][] directions = new int[][]{{0, 1}, {0, -1}, {1, 0}, {-1, 0}};

    public int islandPerimeter(int[][] grid) {
        col = grid[0].length;
        row = grid.length;
        boolean[][] visited = new boolean[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                //Only one island, thus can start at any point of it.
                if(grid[i][j] == 1)
                  return dfsHelper(grid, visited, i, j);
            }
        }
        return 0;
    }

    //to calculate perimeter for each 1 point recursively.
    private int dfsHelper(int[][] grid, boolean[][] visited, int i, int j) {
        //Basic case for DFS, Once reach border or water, perimeter need to be added.
        if(i >= row || i < 0 || j >=col || j < 0 || grid[i][j] == 0){
            return 1;
        }
        if(visited[i][j]) return 0 ;
        visited[i][j] = true;
        int perimeter = 0;
        for(int[] direct : directions) {
            perimeter += dfsHelper(grid, visited, i + direct[0], j + direct[1]);
        }
        return perimeter;
    }
