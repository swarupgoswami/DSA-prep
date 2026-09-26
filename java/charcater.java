import java.util.HashMap;
public class charcater {
    public Character highestfrequencycharc(String s){
        HashMap<Character,Integer>freq=new HashMap<>();
        for(char c:s.toCharArray()){
            freq.put(c,freq.getOrDefault(c,0)+1);
        }
        char maxchar='\0';
        int n=0;
        for(var x:freq.entrySet()){
            if(x.getValue()>n){
                n=x.getValue();
                maxchar=x.getKey();
            }
        }
        return maxchar;
    }
    public static void main(String [] args){
        charcater obj=new charcater();
        String str="aabc";
        System.out.println(obj.highestfrequencycharc(str));
        
    }
}
