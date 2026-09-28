import java.util.Scanner;
import java.util.ArrayList;
public class rotateelements {
    public void rotate(int [] nums,int k){
        ArrayList<Integer>list=new ArrayList<>();
        int n=nums.length;
        k=k%n;
        // store the k elemnts in the list
        for(int i=0;i<k;i++){
            list.add(nums[i]);
        }
        // shift the elemnts to left siude from kth index;
        for(int i=k;i<nums.length;i++){
            nums[i-k]=nums[i];
        }

        //the last position are to be filled with the values stored in arraylist
        for(int i=0;i<k;i++){
            nums[n-k+i]=list.get(i);
        }
        
    }
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);

        System.out.println("enter the size of the array");
        int n=sc.nextInt();

        int []nums=new int[n];
        System.out.println("enter the values " );

        for(int i=0;i<nums.length;i++){
            nums[i]=sc.nextInt();
        }

        System.out.print("Enter k: ");
        int k = sc.nextInt();
        
        rotateelements obj=new rotateelements();

         obj.rotate(nums, k);

        System.out.println("Array after rotation:");

        for (int i = 0; i < n; i++) {
            System.out.print(nums[i] + " ");
        }

        sc.close();


    }
}
