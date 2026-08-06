public class q2243 {
    public String digitsumofstring(String s ,int k){
        while (s.length() > k) {

            StringBuilder temp = new StringBuilder();

            for (int i = 0; i < s.length(); i += k) {

                int sum = 0;

                for (int j = i; j < Math.min(i + k, s.length()); j++) {
                    sum += s.charAt(j) - '0';
                }

                temp.append(sum);
            }

            s = temp.toString();
        }

        return s;
    }
    public static void main(String[]args){
        q2243 obj=new q2243();
        String s="11111222223";
        int k=3;
        System.out.println(obj.digitsumofstring(s, k));

    }
    
}
