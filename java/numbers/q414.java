package numbers;

public class q414 {
    public int thirdhighest(int[] nums) {
        Long first = null;
        Long second = null;
        Long third = null;

        for (int x : nums) {
            Long n = (long)x;

            if ((first != null && n == first) ||
                    (second != null && n == second) ||
                    (third != null && n == third)) {
                continue;
            }

            if (first == null || n > first  ) {
                third = second;
                second = first;
                first = n;
            } else if ( second == null || n > second ) {
                third=second;
                second = n;
            } else if(third==null || n>third) {
                third = n;
            }

        }
        return third == null ? first.intValue() : third.intValue();
    }

    public static void main(String[] args) {
        q414 obj = new q414();
        int[] nums = { 2, 2, 3, 1 };
        System.out.println(obj.thirdhighest(nums));
    }

}
