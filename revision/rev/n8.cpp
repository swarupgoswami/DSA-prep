#include<iostream>
#include<vector>
#include<algorithm>
using namespace std;


int main(){
    vector<int>nums={1,2,3,4,5,6,7,8,9};

    int k=3;
    int n=nums.size();

    k=k%n;

    reverse(nums.begin(),nums.begin()+k);
    reverse(nums.begin()+k,nums.end());
    reverse(nums.begin(),nums.end());

    for(auto x:nums){
        cout<<x<<" ";
    }
    return 0;
}
