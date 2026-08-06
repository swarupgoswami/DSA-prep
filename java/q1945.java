public class q1945{
    public int stringconvert(String s,int k){
        int sum=0;
        for(char ch:s.toCharArray()){
            int val=ch-'a'+1;
            while(val>0){
                sum=sum+val%10;
                val=val/10;
            }
        }
        while(--k>0){
            int newsum=0;
            while(sum>0){
                newsum=newsum+sum%10;
                sum=sum/10;
            }
            sum=newsum;
        }
        return sum;
    }
    public static void main(String[]args){
        q1945 obj=new q1945();
        String s="zbax";
        int k=2;
        System.out.println(obj.stringconvert(s, k));

    }
}