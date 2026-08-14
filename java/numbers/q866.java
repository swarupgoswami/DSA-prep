package numbers;

public class q866 {

    
    public static int primePalindrome(int n) {

       
        if (n <= 2) return 2;
        if (n <= 3) return 3;
        if (n <= 5) return 5;
        if (n <= 7) return 7;
        if (n <= 11) return 11;

        
        for (int len = 1; ; len++) {

            int halfLen = (len + 1) / 2;

            int start = (int) Math.pow(10, halfLen - 1);
            int end = (int) Math.pow(10, halfLen);

            for (int half = start; half < end; half++) {

                String s = String.valueOf(half);

               
                String palindrome = s +
                        new StringBuilder(s.substring(0, len / 2))
                                .reverse();

                int num = Integer.parseInt(palindrome);

              
                if (num >= n && isPrime(num)) {
                    return num;
                }
            }
        }
    }

    public static boolean isPrime(int n) {

        if (n < 2) {
            return false;
        }

        if (n % 2 == 0) {
            return n == 2;
        }

        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        int n = 99;

        int answer = primePalindrome(n);

        System.out.println("Prime Palindrome: " + answer);
    }
}