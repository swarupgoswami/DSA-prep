import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
public class q45 {

    public String freqsort(String s){
       HashMap<Character,Integer>freq=new HashMap<>();
       for(char c:s.toCharArray()){
        freq.put(c,freq.getOrDefault(c,0)+1);
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
            while(n>0){
                ans.append(ch);
                n--;
            }
       }
       return ans.toString();

    }

    public static void main(String [] args){
        q45 obj=new q45();
        String str="tree";
        System.out.println("sorted charcater in a string based on frequency "+" : "+obj.freqsort(str));
    }
    
}
