package hashing;

import java.util.HashMap;

public class Q{
    public String nonrepeatingchar(String s){
        HashMap<Character,Integer>freq=new HashMap<>();
        StringBuilder ans=new StringBuilder();

        for(var ch: s.toCharArray()){
            freq.put(ch,freq.getOrDefault(ch,0)+1);
        }

        for(var entry:freq.entrySet()){
            if(entry.getValue()==1){
               ans.append(entry.getKey());
            }
        }
        return ans.toString();
    }
    public static void main(String[]args){
        Q obj=new Q();
        String s="abbcbc";
        String answer=obj.nonrepeatingchar(s);
        System.out.println(answer);


    }
}
