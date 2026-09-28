package array;
import java.util.Scanner;
public class q152 {
    public int msp(int[]nums){
        int n=nums.length-1;
        int mp=nums[0];
        int minp=nums[0];
        int ans=nums[0];

        for(int i=1;i<=n;i++){
            if(nums[i]<0){
                int temp=mp;
                mp=minp;
                minp=temp;
            }

            mp=Math.max(mp, mp*nums[i]);
            minp=Math.min(minp,minp*nums[i]);
            ans=Math.max(ans,mp);
        }
        return ans;
    }
    public static void main(String [] args){

        Scanner sc=new Scanner(System.in);

       
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

     
        System.out.println("Enter the array elements:");

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

       
        q152 obj = new q152();

     
        int ans = obj.msp(nums);

        
        System.out.println("Maximum Product Subarray: " + ans);

        sc.close();

    }
}
