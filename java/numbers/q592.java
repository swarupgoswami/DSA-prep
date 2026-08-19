package numbers;

public class q592 {

    static String fractionAddition(String expression) {
        int numerator = 0;
        int denominator = 1;

        int i = 0;

        while (i < expression.length()) {
            int sign = 1;

            if (expression.charAt(i) == '+' || expression.charAt(i) == '-') {
                if (expression.charAt(i) == '-') {
                    sign = -1;
                }
                i++;
            }

            int num = 0;
            while (i < expression.length() && Character.isDigit(expression.charAt(i))) {
                num = num * 10 + (expression.charAt(i) - '0');
                i++;
            }

            i++;

            int den = 0;
            while (i < expression.length() && Character.isDigit(expression.charAt(i))) {
                den = den * 10 + (expression.charAt(i) - '0');
                i++;
            }

            numerator = numerator * den + sign * num * denominator;
            denominator = denominator * den;

            int g = gcd(Math.abs(numerator), denominator);

            numerator /= g;
            denominator /= g;
        }

        return numerator + "/" + denominator;
    }

    static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        String expression = "1/2+1/2";
        System.out.println(fractionAddition(expression));
    }
}