#include<iostream>
#include<vector>
using namespace std;


void returnsubsets(vector<int>&nums,vector<vector<int>>&ans,vector<int>& temp,int i){



    if(i==nums.size()){
        ans.push_back(temp);
        return;
    }
    

    temp.push_back(nums[i]);
    returnsubsets(nums,ans,temp,i+1);
    temp.pop_back();

    int index=i+1;
    while(index <nums.size() && nums[index]==nums[index-1] ){
        index++;
    }
    returnsubsets(nums,ans,temp,index);

}

int main(){
    vector<int>nums={1,2,2,3};
    vector<int>temp;
    vector<vector<int>>ans;
    returnsubsets(nums,ans,temp,0);
    for(vector<int> val: ans){
        cout<<"[";
        for(int v:val){
            cout<<v<<" ";
        }
        cout<<"]\n";
    }
    
    return 0;

}