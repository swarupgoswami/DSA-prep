#include<iostream>
#include<vector>
using namespace std;


int singleelemnt(vector<int>&nums){
    int n = nums.size();

    if(n == 1) return nums[0];

    int start = 0;
    int end = n - 1;

    while(start <= end){
        int mid = start + (end - start)/2;

        if(mid == 0){
            if(nums[0] != nums[1]) return nums[0];
            start = mid + 1;
            continue;
        }

        if(mid == n - 1){
            if(nums[n-1] != nums[n-2]) return nums[n-1];
            end = mid - 1;
            continue;
        }

        if(nums[mid] != nums[mid-1] &&
           nums[mid] != nums[mid+1])
            return nums[mid];

        if(mid % 2 == 0){
            if(nums[mid-1] == nums[mid]){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        else{
            if(nums[mid-1] == nums[mid]){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
    }

    return -1;
}

int main(){
    vector<int>nums={1,1,2,2,3,3,4,5,5};
    int singe=singleelemnt(nums);
    cout<<singe<<endl;
    return 0;
}