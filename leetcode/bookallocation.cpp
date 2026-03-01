#include<iostream>
#include<vector>
using namespace std;


bool isValid(vector<int>nums,int n,int m, int mid){
     int student=1, pages=0;
     for(int i=0;i<n;i++){
        if(nums[i]> mid){
            return false;
        }
        if(pages + nums[i]<=mid){
            pages=pages+nums[i];
        }
        else{
            student++;
            pages=nums[i];
        }
     }
     if(student > m ){
        return false;
     }
     else{
        return true;
     }
}


int bookallocation(vector<int>nums,int n,int m){
    if(m>n){
        return -1;
    }
    int sum=0;
    // n is the no of books (size of the vector)
    for(int i=0;i<n;i++){
        sum=sum+nums[i];
        // added all the value of the vector to sum
    }
    int ans=-1; //will store the answer here 
    int st=0;
    while(st<=sum){
        int mid=st+(sum-st)/2;
        if(isValid(nums,n,m,mid)){
            // valid (then left search space)
            ans=mid;
            sum=mid-1;
        }
        else{
            // invalid (then right search space)
            st=mid+1;
        }
    }
    return ans;
    
}



int main(){
     vector<int>nums={12,34,67,90};
     int ba=bookallocation(nums,4,2);
     cout<<"the book allocation should be "<<ba<<endl;


}