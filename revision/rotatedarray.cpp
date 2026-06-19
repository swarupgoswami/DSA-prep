#include<iostream>
#include<vector>
using namespace std;


int binarysearchrotatedarray(vector<int>&nums,int target){
    int start=0;
    int n=nums.size();
    int end=n-1;

    while(start<=end){
        int mid=start+(end-start)/2;
        if(nums[mid]==target) return mid;
        //left side is sorted
        if(nums[mid]>nums[start]){
            if(nums[start]<=target && target<=nums[mid]){

                //target is in sorted side i.e left side
                end=mid-1;
            }
            else{
                start=mid+1;
            }

        }else{ //right side is sorted
            if(nums[mid]<=target && target <=nums[end]){
                //target present in the sorted side
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
    }
    return -1;
}

int main(){
    vector<int> nums = {4,5,6,7,0,1,2};
    int target = 0;
    int number=binarysearchrotatedarray(nums,target);
    cout<<"the index of the target is "<<number<<endl;
    return 0;
}