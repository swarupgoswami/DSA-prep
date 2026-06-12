#include<iostream>
#include<vector>
using namespace std;


int binaryserachrecursion(vector<int>&nums,int start,int end,int t){
    int mid=start+(end-start)/2;
    if(mid==t) return mid;

    if(mid<t){
        return binaryserachrecursion(nums,mid+1,end,t);
    }
    else{
        return binaryserachrecursion(nums,start,mid-1,t);
    }
}

int main(){
    vector<int>arr={1,2,3,4,5,6,7,8,9,10,11};
    int binarysearch=binaryserachrecursion(arr,0,10,4);
    if(binarysearch==4){
        cout<<"found"<<endl;
    }
    else{
        cout<<"not found"<<endl;
    }
    return 0;
}