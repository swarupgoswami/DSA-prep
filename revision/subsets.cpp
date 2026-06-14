#include<iostream>
#include<vector>
using namespace std;


void subsetsrecursion(vector<int>&nums,vector<int>&ans,int i){
      if(i==nums.size()){
        for(int val:ans){
            cout<<val;
        }
        cout<<endl;
        return;

      }
      ans.push_back(nums[i]);
      subsetsrecursion(nums,ans,i+1);
      ans.pop_back( );
      subsetsrecursion(nums,ans,i+1);
}

int main(){
    vector<int>arr={1,2,3};
    vector<int>ans;
    subsetsrecursion(arr,ans,0);
    return 0;
}