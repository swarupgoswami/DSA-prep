#include<iostream>
#include <climits>
using namespace std;

// int maxSubArray(vector<int>& nums) {
//         int currentSum=0;
//         int maxSum=INT_MIN;

//         for(int val: nums){
//             currentSum=currentSum+val;
//             maxSum=max(currentSum,maxSum);
//             if(currentSum<0){
//                 currentSum=0;
//             };
//         }
//         return maxSum;
        
//     }

int main(){
    int arr[]={1,2,3,4,5,6};
    int n=6;

    int maxsum=INT_MIN;
    

    // the first loop iterates the value of start which is not chnged until it travels to the end of the arrayn from the start point of the subarray;
    for(int start=0;start<n;start++){
        int currentSum=0;

        // the second loop iterates the value of end until it travels the entire end of the subarray .after this loop it moves to 1st loop and gets the next start point . 
        for(int end=0; end<n; end ++){
            currentSum=currentSum+arr[end];
            maxsum=max(maxsum,currentSum); 
        }
    }
    cout<<"maxium sum of subarray is :"<<maxsum;

    return 0;


}