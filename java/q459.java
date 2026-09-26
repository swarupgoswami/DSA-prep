public class q459 {
    public boolean subset(String s){
        int n=s.length();

        for(int len=1;len<=n/2;len ++){
            if(n%len!=0) continue;
            String temp=s.substring(0,len);
            StringBuilder ans=new StringBuilder();
            for(int i=0;i<n/len;i++){
                ans.append(temp);
            }
            if(ans.toString().equals(s)){
                return true;
            }
        }
        return false;
    }
    public static void main(String [] args){
        q459 obj=new q459();
        String str="abab";
        System.out.println(obj.subset(str));

    }
}
