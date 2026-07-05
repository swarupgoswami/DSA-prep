#include<iostream>
#include<vector>
#include<unordered_map>
using namespace std;

int frequency(vector<int>&nums,int target){
    int n=nums.size();
    unordered_map<int,int>freq;
    for(int i=0;i<n;i++){
        freq[nums[i]]++;
    }
    for(auto x: freq){
        if(x.first ==target){
            return x.second;
        }
    }
    return -1;
}
int main(){
    vector<int>arr={1,1,2,3,4,5,6,7,8,9,10,10,10};
    int num=10;
    int often=frequency(arr,num);
    cout<<"the frequnecy of a given number is "<<often<<endl;
    return 0;

}