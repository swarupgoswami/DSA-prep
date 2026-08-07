import java.util.ArrayList;
public class stringsyntax{
    public String Longestcommonprefix(ArrayList<String> nums){
        String prefix=nums.get(0);
        for(int i=0;i<prefix.length();i++){
            for(int j=1;j<nums.size();j++){
                if(i==nums.get(j).length() || prefix.charAt(i)!=nums.get(j).charAt(i)){
                    return prefix.substring(0,i);
                }
            }
        }
        return prefix ;

    }
    public  static void main(String[]args){
        stringsyntax obj=new stringsyntax();
        ArrayList<String>nums=new ArrayList<>();
        nums.add("flower");
        nums.add("flow");
        nums.add("float");
        System.out.println(obj.Longestcommonprefix(nums));

    }
}