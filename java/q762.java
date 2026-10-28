
import java.util.Scanner;

public class q762 {

    public int solve(int left, int right) {
        int ans = 0;

        for (int i = left; i <= right; i++) {
            int count = Integer.bitCount(i);

            if (isPrime(count)) {
                ans++;
            }
        }

        return ans;
    }

    public boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int left = sc.nextInt();
        int right = sc.nextInt();

        q762 obj = new q762();
        System.out.println(obj.solve(left, right));

        sc.close();
    }
}
