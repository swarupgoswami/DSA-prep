package numbers;
public class q2413{
    public int smallestevenmultiple(int n){
       return n%2==0?n:n*2;
    }
    public static void main(String [] args){
        q2413 obj=new q2413();
        int ans=obj.smallestevenmultiple(98);
        System.err.println(ans);
    }
}