#include<iostream>
#include<vector>
#include<algorithm>
using namespace std;

vector<int> splitincrease(vector<int>& nums){
    int n = nums.size();
    vector<int> ans;
    sort(nums.begin(), nums.end());

    for(int i = 0; i < n/2; i++){
        ans.push_back(nums[i]);
    }
    for(int i = n-1; i >= n/2; i--){
        ans.push_back(nums[i]);
    }
    return ans;
}

int main(){
    vector<int> arr = {1,2,3,4,5,6,7,8,9,10,11};
    vector<int> arr2 = splitincrease(arr);
    for(auto x : arr2){
        cout << x << " ";
    }
    return 0;
}