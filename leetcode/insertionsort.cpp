#include<iostream>
#include<vector>
using namespace std;


vector<int> insertionSort(vector<int> nums){
    int n=nums.size();
    for(int i=1;i<n;i++){
        int key=nums[i];
        int j=i-1;
        while(j>=0 && nums[j]>key){
            nums[j+1]=nums[j];
            j--;
        }
        nums[j+1]=key;
    }
    return nums;
}

int main(){
   vector<int>nums={8,5,2,3};
   vector<int>nums1=insertionSort(nums);
   for(int x : nums1) {
        cout << x << " ";
    };
   return 0; 
}