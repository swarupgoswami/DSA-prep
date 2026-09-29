import java.util.*;

public class nextgreaterelement{
    public int[] nextgreaterelemnt(int[] arr){
        int[]ans=new int[arr.length];
        Stack<Integer>s=new Stack<>();

        for(int i=arr.length-1;i>=0;i--){
            
            while(!s.isEmpty() && arr[i]>=s.peek()){
                s.pop();
            }
            if(s.isEmpty()){
                ans[i]=-1;
            }
            else{
                ans[i]=s.peek();
            }
            s.push(arr[i]);
        }
        return ans;
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements in the array:");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        nextgreaterelement obj = new nextgreaterelement();

        int[] answer = obj.nextgreaterelemnt(arr);

        System.out.println("Answer:");

        for (var x : answer) {
            System.out.println(x);
        }
    }
}
