#include<iostream>
#include<vector>
#include<algorithm>
using namespace std;


int main(){
    vector<int>nums={7,8,5,6,4,2,3,1};

    sort(nums.begin(),nums.end());
    int start=0;
    int end=nums.size()-1;
    int mid=start+(end-start)/2;

    for(int i=0;i<=mid-1;i++){
        cout<<nums[i]<<" ";
    }
    for(int i=mid;i<=end;i++){
        cout<<nums[i]<<" ";
    }
    return 0;
}