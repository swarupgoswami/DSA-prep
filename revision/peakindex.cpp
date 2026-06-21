#include<iostream>
#include<vector>
using namespace std;


int peakindex(vector<int>&nums){
    //taking start as 1 and end n-2 for the boundary condition
    int start=1;
    int end=nums.size()-2;
    while(start<=end){
        int mid=start+(end-start)/2;

        if(nums[mid]>nums[mid-1]&&nums[mid]>nums[mid+1]) return mid;
        else if(nums[mid]>nums[mid-1]){
            start=mid+1;
        }
        else{
            end=mid-1;
        }
    }
    return -1;
}


int main(){
    vector<int>arr={1,2,9,8,4,3,2,1};
    int pi=peakindex(arr);
    cout<<"the peak index of the mounted array is "<<pi<<endl;
    return 0;
}