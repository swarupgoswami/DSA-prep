public class q1004{
    public int consecutiveones(int [] nums,int k){
        int left=0;
        int zerocount=0;
        int maxlen=0;
        for(int right=0;right<nums.length-1;right++){
            if(nums[right]==0){
                zerocount++;

            }
            while(zerocount>k){
                if(nums[left]==0){
                    zerocount--;
                }
                left++;
            }
            maxlen=Math.max(maxlen,right-left+1);
        }
        return maxlen;
    }
    public static void main(String [] args){
       q1004 obj=new q1004();
       int[] nums = {1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0};
       int ans=obj.consecutiveones(nums,2);
       System.out.println("thye consecutive ones in the given array is "+ans);
    }
}