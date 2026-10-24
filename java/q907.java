import java.util.*;

public class q907 {

    public static int solve(int[] arr) {
        int n = arr.length;
        int mod = 1000000007;

        int[] pse = new int[n];
        int[] nse = new int[n];

        Stack<Integer> st = new Stack<>();

   
        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && arr[st.peek()] >= arr[i]) {
                st.pop();
            }

            pse[i] = st.isEmpty() ? -1 : st.peek();
            st.push(i);
        }

        st.clear();

       
        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && arr[st.peek()] > arr[i]) {
                st.pop();
            }

            nse[i] = st.isEmpty() ? n : st.peek();
            st.push(i);
        }

     
        long sum = 0;

        for (int i = 0; i < n; i++) {
            long leftChoices = i - pse[i];
            long rightChoices = nse[i] - i;

            long contribution =
                (leftChoices * rightChoices % mod) * arr[i] % mod;

            sum = (sum + contribution) % mod;
        }

        return (int) sum;
    }

    public static void main(String[] args) {
        int[] arr = {3, 1, 2, 4};

        int ans = solve(arr);

        System.out.println(ans); 
    }
}