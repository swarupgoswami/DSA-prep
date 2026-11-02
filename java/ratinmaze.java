import java.util.*;

public class ratinmaze {

    public static void solve(int[][] maze, int i, int j, int n,
                             String path, ArrayList<String> ans) {

        if (i == n - 1 && j == n - 1) {
            ans.add(path);
            return;
        }

        maze[i][j] = 0;

        if (i + 1 < n && maze[i + 1][j] == 1) {
            solve(maze, i + 1, j, n, path + "D", ans);
        }

        if (j - 1 >= 0 && maze[i][j - 1] == 1) {
            solve(maze, i, j - 1, n, path + "L", ans);
        }

        if (j + 1 < n && maze[i][j + 1] == 1) {
            solve(maze, i, j + 1, n, path + "R", ans);
        }

        if (i - 1 >= 0 && maze[i - 1][j] == 1) {
            solve(maze, i - 1, j, n, path + "U", ans);
        }

        maze[i][j] = 1;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[][] maze = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                maze[i][j] = sc.nextInt();
            }
        }

        ArrayList<String> ans = new ArrayList<>();

        if (maze[0][0] == 1) {
            solve(maze, 0, 0, n, "", ans);
        }

        Collections.sort(ans);

        System.out.println(ans);

        sc.close();
    }
}