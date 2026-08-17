package numbers;

public class q1071 {

    public static String gcdOfStrings(String str1, String str2) {

        if (!(str1 + str2).equals(str2 + str1)) {
            return "";
        }

        int a = str1.length();
        int b = str2.length();

        while (b != 0) {
            int rem = a % b;
            a = b;
            b = rem;
        }

        return str1.substring(0, a);
    }

    public static void main(String[] args) {

        String str1 = "ABCABC";
        String str2 = "ABC";

        String ans = gcdOfStrings(str1, str2);

        System.out.println(ans);
    }
}