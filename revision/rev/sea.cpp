#include<iostream>
#include<vector>
using namespace std;


int smallestelemet(vector<int>&nums){
    int min=nums[0];

    for(int i=1;i<nums.size();i++){
        if(min>nums[i]){
           min=nums[i];
        };

    }
    return min;
}


int main(){
  vector<int>arr={9,4,6,2,3,7,8,4,1};
  int smallest=smallestelemet(arr);
  cout<<"the smallest element is "<<smallest<<endl;
  return 0;
}