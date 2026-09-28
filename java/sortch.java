import java.util.ArrayList;
public class sortch{
    public String sortcharactersstring(String s){
        ArrayList<Character>list=new ArrayList<>();
        for(char ch : s.toCharArray()){
              list.add(ch);
        }
        list.sort(null);
        StringBuilder ans=new StringBuilder();
        for(char ch: list){
            ans.append(ch);
        }
        return ans.toString();

    }
    public static void main (String [] args){
       sortch obj=new sortch();
       String str="treat";
       String answer=obj.sortcharactersstring(str);
       System.out.println("the sorted string"+" "+answer);
    }
}