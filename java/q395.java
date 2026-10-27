
public class q395 {

    public static int solve(String s, int k) {
        if (s.length() < k) {
            return 0;
        }

        int[] freq = new int[26];

        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (freq[c - 'a'] < k) {
                int left = solve(s.substring(0, i), k);
                int right = solve(s.substring(i + 1), k);

                return Math.max(left, right);
            }
        }

        return s.length();
    }

    public static void main(String[] args) {
        String s = "aaabb";
        int k = 3;

        int result = solve(s, k);

        System.out.println("Longest Valid Substring Length: " + result);
    }
}
