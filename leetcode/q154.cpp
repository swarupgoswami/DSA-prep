#include<iostream>
#include<vector>
using namespace std;


int minimumininduplicaterotatedarray(vector<int>&nums){
    int start=0;
    int end=nums.size()-1;
    while(start<end){
        int mid=start+(end-start)/2;
        if(nums[mid]>nums[end]){
            //minimum is in the right side of the rotaed sorted array;
            start=mid+1;

        }
        else if(nums[mid]<nums[end]){
            end=mid;
        }
        else{
            end --;
        }
    }
    return nums[start];
}

int main(){
    vector<int>nums={2,2,2,0,1};
    int minimum=minimumininduplicaterotatedarray(nums);
    cout<<"the minimum is "<<minimum<<endl;
    return 0;
  
}