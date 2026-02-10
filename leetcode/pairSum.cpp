#include<iostream>
#include<vector>
using namespace std;

vector<int> pairsum(vector<int> v,int target){

    vector<int>ans;
    int n=v.size();
    for(int i=0;i<n;i++){
        for(int j=i+1;j<n;j++){
          if(v[i]+v[j]==target){
            ans.push_back(i);
            ans.push_back(j);
            return ans;
          }
        }
    };
    return ans;
}



int main(){
    vector<int> v={1,2,3,4};
    int target=5;

    vector<int>a=pairsum(v,target);
    cout<<"ans is"<<a[0]<<","<<a[1]<<endl;
    return 0;

}