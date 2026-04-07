#include<iostream>
#include<vector>
using namespace std;


void printsubset(vector<int>nums,vector<int>ans,int i){

   if(i==nums.size()){
    for(int val:ans){
        cout<<val<<" ";
        
    }
    cout<<endl;
    return;
   }
    // at first keep including the elemnts into the ans vector
    
    ans.push_back(nums[i]); //pushes the element into the ans
    printsubset(nums,ans,i+1); //calls the recursive function and passes the next index which will keep adding the elements into the ans array until u hit the base case 
    
    ans.pop_back(); //this line gets only executed when base cas hits and you return and now you dont call the above recursive function ;

    printsubset(nums,ans,i+1);
}

int main(){

    vector<int>nums={1,2,3};
    vector<int>ans;
    printsubset(nums,ans,0);
    return 0;

}