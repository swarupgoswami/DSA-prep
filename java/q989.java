
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class q989 {

    public List<Integer> addToArrayForm(int[] num, int k) {

        ArrayList<Integer> ans = new ArrayList<>();

        int i = num.length - 1;

        while (i >= 0 || k > 0) {

     
            int digit = k % 10;

            if (i >= 0) {
                digit += num[i];
                i--;
            }

         
            ans.add(digit % 10);

  
            k = k / 10;

            if (digit >= 10) {
                k++;
            }
        }

        while (i >= 0) {
            ans.add(num[i]);
            i--;
        }

        Collections.reverse(ans);

        return ans;
    }

    public static void main(String[] args) {

        q989 obj = new q989();

        int[] num = {1, 2, 0, 0};
        int k = 34;

        System.out.println(obj.addToArrayForm(num, k));
    }
}

