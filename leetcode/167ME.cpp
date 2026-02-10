// majority element
// moore's algo
#include<iostream>
#include<vector>
using namespace std;

int majorityElement(vector<int>nums){
    int n=nums.size();
    int frequency=0;
    int ans=0;

    for(int i=0;i<n;i++){
        if(frequency==0){
            ans=nums[i];
        }
        if(ans==nums[i]){
            frequency ++;
        }
        else{
            frequency --;
        }
    }
    return ans;
}

int main(){
     vector<int>nums={1,2,2,2,2,1};
     int ME=majorityElement(nums);
}