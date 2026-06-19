#include<iostream>
#include<vector>
using namespace std;


int minimuminbinarysearchsortedarray(vector<int>&nums){
    int start=0;
    int end=nums.size()-1;
    while(start<end){
        int mid=start+(end-start)/2;

        

        if(nums[mid]>nums[end]){
            start=mid+1;
        }
        else{
            end=mid;
        }

    }
    return nums[start];

}


int main(){
    vector<int>nums={4,5,6,7,1,2};
    int minimum=minimuminbinarysearchsortedarray(nums);
    cout<<"the mimimum number is "<<minimum<<endl;
    return 0;
    

}