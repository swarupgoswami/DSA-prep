package hashing;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Map;
public class q451 {

    public String sortcharacteronfreq(String s){
        HashMap<Character,Integer>freq=new HashMap<>();

        for(char ch:s.toCharArray()){
            freq.put(ch,freq.getOrDefault(ch,0)+1);
        }

        ArrayList<Map.Entry<Character,Integer>>list=new ArrayList<>();

        for(var x:freq.entrySet()){
            list.add(x);
        }

        list.sort((a,b)->b.getValue()-a.getValue());

        StringBuilder ans=new StringBuilder();

        for(var x:list){
            char ch=x.getKey();
            int n=x.getValue();
            for(int i=1;i<=n;i++){
                ans.append(ch);
            }
        }
        return ans.toString();

    }

    public static void main(String[]args){
        q451 obj=new q451();
        String s="abcaba";
        System.out.println(obj.sortcharacteronfreq(s));

    }
    
}
