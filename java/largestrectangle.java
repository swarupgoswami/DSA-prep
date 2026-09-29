import java.util.*;

public class largestrectangle {

    public static int largestRectangle(int[] heights) {

        int n = heights.length;

        ArrayList<Integer> left = new ArrayList<>();
        ArrayList<Integer> right = new ArrayList<>();

        // Finding Previous Smaller Element
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < n; i++) {

            while (!st.isEmpty() && heights[st.peek()] >= heights[i]) {
                st.pop();
            }

            if (st.isEmpty()) {
                left.add(-1);
            } else {
                left.add(st.peek());
            }

            st.push(i);
        }

        // Clear stack for Next Smaller Element
        st.clear();

        for (int i = n - 1; i >= 0; i--) {

            while (!st.isEmpty() && heights[st.peek()] >= heights[i]) {
                st.pop();
            }

            if (st.isEmpty()) {
                right.add(0, n);
            } else {
                right.add(0, st.peek());
            }

            st.push(i);
        }

        // Calculate maximum area
        int maxArea = 0;

        for (int i = 0; i < n; i++) {

            int width = right.get(i) - left.get(i) - 1;

            int currentArea = heights[i] * width;

            maxArea = Math.max(maxArea, currentArea);
        }

        return maxArea;
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of bars: ");
        int n = sc.nextInt();

        int[] heights = new int[n];

        System.out.println("Enter heights:");

        for (int i = 0; i < n; i++) {
            heights[i] = sc.nextInt();
        }

        int answer = largestRectangle(heights);

        System.out.println("Largest Rectangle Area = " + answer);

        sc.close();
    }
}