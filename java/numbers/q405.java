package numbers;

public class q405 {

    // LeetCode 405: Convert a Number to Hexadecimal
    public static String toHex(int num) {
        if (num == 0) {
            return "0";
        }

        StringBuilder result = new StringBuilder();
        char[] hex = "0123456789abcdef".toCharArray();

        // Use unsigned right shift so negative numbers work correctly
        while (num != 0) {
            int digit = num & 15; // Get last 4 bits
            result.append(hex[digit]);
            num >>>= 4;
        }

        return result.reverse().toString();
    }

    public static void main(String[] args) {

        int num = 98;

        String answer = toHex(num);

        System.out.println("Hexadecimal: " + answer);
    }
}