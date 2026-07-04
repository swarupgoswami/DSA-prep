#include<iostream>
#include<vector>
#include<climits>
using namespace std;


int secondsmallest(vector<int>&nums){
    int n=nums.size();
    int min = INT_MAX;
    int secondmin = INT_MAX;

    for(int i=0;i<n-1;i++){
        if(min>nums[i]){
            secondmin=min;
            min=nums[i];
        }
        else if(nums[i]>min && nums[i]<secondmin){
            secondmin=nums[i];
        }
    }
    return secondmin;

}


int main(){
    vector<int>arr={9,8,6,2,3,4,8,7};
    int secondsmall=secondsmallest(arr);
    cout<<"the secondsmallest is "<<secondsmall<<endl;
    return 0;

}