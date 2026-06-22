#include<iostream>
#include<vector>
using namespace std;


bool isvalid(vector<int>&nums,int person,int maxallowedpages){
    int s=1;
    int pages=0;
    int n=nums.size()-1;
    for(int i=0;i<=n;i++){
        if(nums[i]>maxallowedpages) return false;
        if(nums[i]+pages<=maxallowedpages){
            pages=pages+nums[i];
        }
        else{
            s++;
            pages=nums[i];
        }
    }
    return s<=person;
}


int bookallocated(vector<int>&nums,int person){

    int start=0;
    int end=0;

    for(int x:nums){
        start=max(start,x);
        end+=x;
    }

    int ans=-1;

    while(start<=end){
        int mid=start+(end-start)/2;

        if(isvalid(nums,person,mid)){
            ans=mid;
            end=mid-1;
        }
        else{
            start=mid+1;
        }
    }
    return ans;

}


int main(){
    vector<int>arr={2,1,3,4};
    int person=2;
    int ans=bookallocated(arr,person);
    cout<<"the minimum of max pages allocated to a single person is "<<ans<<endl;
    return 0;

}