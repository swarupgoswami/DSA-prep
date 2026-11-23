
package graph;

public class q200 {

    public static void dfs(char[][] grid, int row, int col) {

        int n = grid.length;
        int m = grid[0].length;

        if (row < 0 || col < 0 || row >= n || col >= m || grid[row][col] == '0') {
            return;
        }

        grid[row][col] = '0';

     
        dfs(grid, row - 1, col); 
        dfs(grid, row + 1, col); 
        dfs(grid, row, col - 1); 
        dfs(grid, row, col + 1); 
    }

    public static int numIslands(char[][] grid) {

        int n = grid.length;
        int m = grid[0].length;

        int count = 0;

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < m; j++) {

                if (grid[i][j] == '1') {

                    count++;

                    dfs(grid, i, j);
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {

        char[][] grid = {
            {'1', '1', '0', '0', '1'},
            {'1', '0', '0', '1', '1'},
            {'0', '0', '0', '0', '0'},
            {'1', '1', '0', '0', '1'}
        };

        System.out.println("Number of Islands: " + numIslands(grid));
    }
}
