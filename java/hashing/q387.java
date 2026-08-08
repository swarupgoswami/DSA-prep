package hashing;

import java.util.HashMap;

public class q387 {
    public Character uniquechar(String s){
        HashMap<Character,Integer>freq=new HashMap<>();
        for(char ch:s.toCharArray()){
            freq.put(ch,freq.getOrDefault(ch,0)+1);
        }

        for(int i=0;i<=s.length()-1;i++){
            if(freq.get(s.charAt(i))==1){
                return s.charAt(i);
            }
        }
        return '\0';
        
    }
    public static void main(String[]args){
        q387 obj=new q387();
        String s="tree";
        System.out.println(obj.uniquechar(s));

    }
    
}
