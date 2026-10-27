
public class q76 {

    public static String solve(String s, String t) {
        int[] need = new int[128];

        for (char c : t.toCharArray()) {
            need[c]++;
        }

        int left = 0;
        int right = 0;
        int required = t.length();

        int minLen = Integer.MAX_VALUE;
        int start = 0;

        while (right < s.length()) {
            char c = s.charAt(right);

            if (need[c] > 0) {
                required--;
            }

            need[c]--;
            right++;

            while (required == 0) {
                if (right - left < minLen) {
                    minLen = right - left;
                    start = left;
                }

                char leftChar = s.charAt(left);
                need[leftChar]++;

                if (need[leftChar] > 0) {
                    required++;
                }

                left++;
            }
        }

        if (minLen == Integer.MAX_VALUE) {
            return "";
        }

        return s.substring(start, start + minLen);
    }

    public static void main(String[] args) {
        String s = "aaflslflsldkalskaaa";
        String t = "aaa";

        String ans = solve(s, t);

        System.out.println("Minimum Window Substring: " + ans);
    }
}
