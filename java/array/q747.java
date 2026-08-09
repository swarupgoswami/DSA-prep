package array;

public class q747 {
    public int largestgreater(int [] nums){
        int largest=nums[0];
        int secondlargest=Integer.MIN_VALUE;
        int largeindex=0;

        for(int i=0;i<=nums.length-1;i++){
            if(nums[i]>largest){
                secondlargest=largest;
                largest=nums[i];
                largeindex=i;
            }
            else if(nums[i]>secondlargest && nums[i]!=largest){
                secondlargest=nums[i];
            }
        }
        if(largest>=2*secondlargest){
            return largeindex;
        }
        else{
            return -1;
        }
    }
    public static void main(String [] args){
        q747 obj=new q747();
        int[] nums={2,3,6,1};
        System.out.println(obj.largestgreater(nums));

    }
    
}
