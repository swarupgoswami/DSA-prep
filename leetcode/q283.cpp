#include<iostream>
#include<vector>
using namespace std;


vector<int> movedzeores(vector<int>nums){
    int n=nums.size();
    int j=0; 
    for(int i=0;i<n;i++){
        if(nums[i]!=0){
            swap(nums[i],nums[j]);
            j++;
        }
    }
    return nums;
}

int main(){
    vector<int>nums={1,3,0,12,5};
    vector<int>ans=movedzeores(nums);

    for(int i=0;i<ans.size();i++){
        cout<<ans[i]<<endl;
    };
    return 0;

}