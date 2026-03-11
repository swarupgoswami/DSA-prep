#include<iostream>
#include<vector>
using namespace std;


vector<int> atmost2dupplicated(vector<int>nums){
    int n=nums.size();

    int i=2;  //cause the first 2 e;lemts will always remain the same so we 2 poinyter approach keep i pointing to the second(third index) position

    for(int j=2;j<n;j++){
        //the j pointer iterates through entire vector 

        if(nums[j]!=nums[i-2]){
            nums[i]=nums[j];
            i++;
        }
        // else{
        //     continue;
        // }
    }
    nums.resize(i);
    return nums;
}



// remove the dupliactes fgrom sorted and keep atmost 2 duplicates in the array


int main(){
    vector<int>nums={1,1,1,2,2,3};
    vector<int>ans=atmost2dupplicated(nums);
    for(int i:ans){
        cout<<" "<<i;
    };
    return 0;
}