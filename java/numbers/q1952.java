package numbers;
public class q1952{

    public int countdivisor(int n){
        int count=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args){
        q1952 obj=new q1952();
        System.out.println(obj.countdivisor(10));

    }
}