#include<iostream>
#include<vector>
#include<unordered_map>
using namespace std;


int subarraysumequaltok(vector<int>nums,int k){
    int n=nums.size();
    int count=0;
    vector<int>prefixsum(n,0);
    unordered_map<int,int>m;
    for(int i=1;i<n;i++){
        prefixsum[i]=prefixsum[i-1]+nums[i];
    }
    for(int j=0;j<n;j++){
        if(prefixsum[j]==k) count++;
        int value=prefixsum[j]-k;
        if(m.find(value)!=m.end()){
            count+=m[value];
        }
        if(m.find(prefixsum[j])==m.end()){
            m[prefixsum[j]]++;
        }
    }
    return count;

}



int main(){

    vector<int>ans={9,0,20,3,10,5};
    int num=subarraysumequaltok(ans,33);
    cout<<"the number of  subarray whose value is equal to "<<" "<<num<<endl;
    return 0;

}