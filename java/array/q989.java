package array;

import java.util.*;

public class q989 {

    public List<Integer> addToArrayForm(int[] num, int k) {

        List<Integer> result = new ArrayList<>();

        int i = num.length - 1;

        while (i >= 0 || k > 0) {

            if (i >= 0) {
                k = k + num[i];
                i--;
            }

            result.add(k % 10);
            k = k / 10;
        }

        Collections.reverse(result);

        return result;
    }

    public static void main(String[] args) {

        int[] num = {1, 2, 0, 0};
        int k = 34;

        q989 obj = new q989();

        List<Integer> result = obj.addToArrayForm(num, k);

        System.out.println(result);
    }
}