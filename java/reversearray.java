public class reversearray {
    public void reverse_array(int[] nums){
       int left=0;
       int right=nums.length-1;
       while(right>left){
        int temp=nums[left];
        nums[left]=nums[right];
        nums[right]=temp;
        left++;
        right--;
       }
    }
   public static void main(String [] args){
    reversearray obj=new reversearray();
    int [] nums={2,2,3,1};
    obj.reverse_array(nums);
    for(int x:nums){
        System.out.println(x);
    }
    

   } 
}
