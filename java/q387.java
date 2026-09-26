
import java.util.HashMap;
public class q387 {
    public Character firstuniquecharacter(String s){
        HashMap<Character,Integer> frequency=new HashMap<>();
        for(var x:s.toCharArray()){
            frequency.put(x,frequency.getOrDefault(x,0)+1);
        }
        for(int i=0;i<s.length()-1;i++){
            if(frequency.get(s.charAt(i))==1){
                return s.charAt(i);
            }
        }
        return 'x';
    }
    public static void main(String [] args){
        q387 obj=new q387();
        String s="aacbbd";
        System.out.println(obj.firstuniquecharacter(s));

    }
    
}
