package numbers;



public class q1979 {
    public static void main(String [] args){
          int [] nums={10,9,8,5,6,7,2,1};
          int min=nums[0];
          int max=nums[0];

          for(int i=0;i<=nums.length-1;i++){
            min=Math.min(min,nums[i]);
            max=Math.max(max,nums[i]);
          }

          while(max!=0){
            int rem=min%max;
            min=max;
            max=rem;
          }
          System.err.println(min);
    }
}
