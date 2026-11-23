
package graph;

import java.util.*;

public class q994 {

    public static int orange(int[][] grid) {

        int n = grid.length;
        int m = grid[0].length;

        Deque<int[]> q = new ArrayDeque<>();

        int fresh = 0;
        int ans = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {

                if (grid[i][j] == 2) {
                    q.add(new int[]{i, j, 0});
                }

                if (grid[i][j] == 1) {
                    fresh++;
                }
            }
        }

        int[] dr = {-1, 1, 0, 0};
        int[] dc = {0, 0, -1, 1};

        while (!q.isEmpty()) {

            int[] curr = q.poll();

            int r = curr[0];
            int c = curr[1];
            int t = curr[2];

            ans = Math.max(ans, t);

            for (int k = 0; k < 4; k++) {

                int nr = r + dr[k];
                int nc = c + dc[k];

                if (nr >= 0 && nr < n &&
                    nc >= 0 && nc < m &&
                    grid[nr][nc] == 1) {

                    grid[nr][nc] = 2;
                    fresh--;

                    q.add(new int[]{nr, nc, t + 1});
                }
            }
        }

        if (fresh > 0) {
            return -1;
        }

        return ans;
    }

    public static void main(String[] args) {

        int[][] grid = {
            {2, 1, 1},
            {1, 1, 0},
            {0, 1, 1}
        };

        System.out.println(orange(grid));
    }
}
