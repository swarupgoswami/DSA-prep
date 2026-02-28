#include<iostream>
#include<vector>
using namespace std;


int peakIndex(vector<int>nums){
    int st=1;
    int end=nums.size()-2;

    // sstrating index is 1 and last index is n-2 cause both of them acant have peak value cause it is a mounted array 
    
    while(st<=end){
        int mid=st+(end-st)/2;
        if(nums[mid]>nums[mid-1] && nums[mid] >nums[mid+1]){
            return mid;
        }
        else if(nums[mid]>nums[mid-1]){
            // it means the peak index lies on the left search space
            st=mid+1;
        }
        else{
            // it means the peak index is on the left search space casue nums[mid]>nums[mid+1]
            end=mid-1;
        }
        
    }
    return -1;
}


int main(){
   vector<int> nums={0,3,8,9,5,2};
   int bs=peakIndex(nums);
   cout<<"the peak index is "<<bs<<endl;
}