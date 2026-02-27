#include<iostream>
#include<vector>
using namespace std;

int binearySearch(vector<int> nums,int t){
     int start=0;
     int n=nums.size();
     int end=n-1;
     int mid;

    while(start <= end){
        mid=(start+end)/2;
        if(t > nums[mid]){
            start=mid+1;

        }
        else if(t < nums[mid]){
              end=mid-1;
        }
        else{
           return mid;
        }
    }
    return -1;

}




int main(){

    vector<int> nums={1,2,3,4,5,6,7,8,9};
    int bs=binearySearch(nums,9);
    cout<<bs<<endl;
    return 0;
  
}