public class q1281{
    public int substractproductssum(int n){
        int sum=0;
        int products=1;
        int ans;
        while(n>0){
            sum+=n%10;
            products*=(n%10);
            n=n/10;
        }
        ans=products-sum;
        return ans;
    }
    public static void main(String[]args){
        int n=99;
        q1281 obj=new q1281();

        System.out.println(obj.substractproductssum(n));
        

    }
}