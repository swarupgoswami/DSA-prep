import java.util.*;

public class nqueens {

    public static boolean isSafe(int row, int col, char[][] board, int n) {

        for (int i = 0; i < row; i++) {
            if (board[i][col] == 'Q')
                return false;
        }

        int i = row - 1;
        int j = col - 1;

        while (i >= 0 && j >= 0) {
            if (board[i][j] == 'Q')
                return false;

            i--;
            j--;
        }

        i = row - 1;
        j = col + 1;

        while (i >= 0 && j < n) {
            if (board[i][j] == 'Q')
                return false;

            i--;
            j++;
        }

        return true;
    }

    public static void solve(char[][] board, int row, int n,
                             ArrayList<ArrayList<String>> ans) {

        if (row == n) {
            ArrayList<String> temp = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                temp.add(new String(board[i]));
            }

            ans.add(temp);
            return;
        }

        for (int j = 0; j < n; j++) {

            if (isSafe(row, j, board, n)) {

                board[row][j] = 'Q';

                solve(board, row + 1, n, ans);

                board[row][j] = '.';
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        char[][] board = new char[n][n];

        for (int i = 0; i < n; i++) {
            Arrays.fill(board[i], '.');
        }

        ArrayList<ArrayList<String>> ans = new ArrayList<>();

        solve(board, 0, n, ans);

        for (ArrayList<String> solution : ans) {
            for (String s : solution) {
                System.out.println(s);
            }
            System.out.println();
        }

        System.out.println("Total solutions: " + ans.size());

        sc.close();
    }
}