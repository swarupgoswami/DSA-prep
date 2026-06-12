#include<iostream>
#include<vector>
using namespace std;


bool isortedrecursive(vector<int>nums,int n){
    if(n==0 || n==1) return true;

    return nums[n-1]>nums[n-2]&& isortedrecursive(nums,n-1);
}


int main(){
    vector<int>arr={1,2,3,4,5,6,7,8,9,10,11};
    int n=arr.size();
    bool isorted=isortedrecursive(arr,n);
    if(isorted){
        cout<<"the given array is sorted"<<endl;
    }
    else{
        cout<<"unsorted"<<endl;
    };
    
    return 0;
}