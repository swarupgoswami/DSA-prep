import java.util.*;

public class Stacksolutions {

    public static void main(String[] args) {

        // =========================================
        // 1. BASIC STACK METHODS
        // =========================================

        Stack<Integer> st = new Stack<>();

        // push()
        st.push(10);
        st.push(20);
        st.push(30);

        System.out.println("Stack: " + st);

        // peek() -> top element
        System.out.println("Top: " + st.peek());

        // pop() -> remove top
        st.pop();
        System.out.println("After pop: " + st);

        // size()
        System.out.println("Size: " + st.size());

        // isEmpty()
        System.out.println("Is empty: " + st.isEmpty());


        // =========================================
        // 2. NEXT GREATER ELEMENT
        // =========================================

        int[] arr1 = {4, 5, 2, 10, 8};

        int[] nge = nextGreaterElement(arr1);

        System.out.println(
                "Next Greater Element: "
                + Arrays.toString(nge)
        );


        // =========================================
        // 3. PREVIOUS SMALLER ELEMENT
        // =========================================

        int[] arr2 = {4, 5, 2, 10, 8};

        int[] pse = previousSmallerElement(arr2);

        System.out.println(
                "Previous Smaller Element: "
                + Arrays.toString(pse)
        );


        // =========================================
        // 4. STOCK SPAN
        // =========================================

        int[] prices = {100, 80, 60, 70, 60, 75, 85};

        int[] span = stockSpan(prices);

        System.out.println(
                "Stock Span: "
                + Arrays.toString(span)
        );


        // =========================================
        // 5. TRAPPING RAIN WATER
        // =========================================

        int[] height = {3, 0, 0, 2, 0, 4};

        int water = trappingRainWater(height);

        System.out.println(
                "Water Trapped: " + water
        );
    }


    // =========================================================
    // NEXT GREATER ELEMENT
    // =========================================================

    static int[] nextGreaterElement(int[] arr) {

        int n = arr.length;
        int[] ans = new int[n];

        Stack<Integer> st = new Stack<>();

        // Right -> Left
        for (int i = n - 1; i >= 0; i--) {

            while (!st.isEmpty() && st.peek() <= arr[i]) {
                st.pop();
            }

            if (st.isEmpty()) {
                ans[i] = -1;
            } else {
                ans[i] = st.peek();
            }

            st.push(arr[i]);
        }

        return ans;
    }


    // =========================================================
    // PREVIOUS SMALLER ELEMENT
    // =========================================================

    static int[] previousSmallerElement(int[] arr) {

        int n = arr.length;
        int[] ans = new int[n];

        Stack<Integer> st = new Stack<>();

        // Left -> Right
        for (int i = 0; i < n; i++) {

            while (!st.isEmpty() && st.peek() >= arr[i]) {
                st.pop();
            }

            if (st.isEmpty()) {
                ans[i] = -1;
            } else {
                ans[i] = st.peek();
            }

            st.push(arr[i]);
        }

        return ans;
    }


    // =========================================================
    // STOCK SPAN
    // =========================================================

    static int[] stockSpan(int[] prices) {

        int n = prices.length;
        int[] span = new int[n];

        Stack<Integer> st = new Stack<>();

        // Store INDEX, not value
        for (int i = 0; i < n; i++) {

            while (!st.isEmpty()
                    && prices[st.peek()] <= prices[i]) {

                st.pop();
            }

            if (st.isEmpty()) {
                span[i] = i + 1;
            } else {
                span[i] = i - st.peek();
            }

            st.push(i);
        }

        return span;
    }


    // =========================================================
    // TRAPPING RAIN WATER
    // =========================================================

    static int trappingRainWater(int[] height) {

        int n = height.length;

        int[] lmax = new int[n];
        int[] rmax = new int[n];

        // -----------------------------------------
        // LMAX
        // -----------------------------------------

        lmax[0] = height[0];

        for (int i = 1; i < n; i++) {

            lmax[i] = Math.max(
                    height[i],
                    lmax[i - 1]
            );
        }


        // -----------------------------------------
        // RMAX
        // -----------------------------------------

        rmax[n - 1] = height[n - 1];

        for (int i = n - 2; i >= 0; i--) {

            rmax[i] = Math.max(
                    height[i],
                    rmax[i + 1]
            );
        }


        // -----------------------------------------
        // WATER
        // -----------------------------------------

        int water = 0;

        for (int i = 0; i < n; i++) {

            water += Math.min(lmax[i], rmax[i])
                    - height[i];
        }

        return water;
    }
}