import java.util.ArrayList;
import java.util.Stack;
import java.util.Scanner;

public class stockspan{

    public ArrayList<Integer> stock_span(int [] nums){
       ArrayList<Integer>ans=new ArrayList<>();
       Stack<Integer>s=new Stack<>();

       for(int i=0;i<nums.length;i++){
        while(!s.isEmpty() && nums[s.peek()]<=nums[i]){
            s.pop();
        }
        if(s.isEmpty()){
            ans.add(i+1);
        }
        else{
            ans.add(i-s.peek());
        }
        s.push(i);
       }
       return ans;
    }
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the number of elemnts in the array");
        int n=sc.nextInt();

        int[] nums=new int[n];

        System.out.println("enter the elements");
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }

        stockspan obj=new stockspan();

        ArrayList<Integer>answer=obj.stock_span(nums);

        for(var x:answer){
            System.out.println(x);
        }


    }
}