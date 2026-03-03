#include<iostream>
#include <algorithm>
#include<vector>
using namespace std;


bool isValid(vector<int> &stalls, int cow, int minimumallowedddistance){
    int cows=1,last_position=stalls[0];
    int n=stalls.size();
    for(int i=1;i<n;i++){
        if(stalls[i]-last_position >= minimumallowedddistance){
            cows ++;
            last_position=stalls[i];
        }
        if(cows == cow) return true;
    }
    return false;

}




int bestPosition(vector<int>stalls,int cow){
    sort(stalls.begin(),stalls.end());
    int n=stalls.size();
    int start=1;
    int end=stalls[n-1]-stalls[0];
    int ans=-1;
    while(start<=end){
        int mid=start+(end-start)/2;
        if(!isValid(stalls,cow,mid)){
            // left serach space

            end=mid-1;
        }
        else{
            ans=mid;
            start=mid+1;
        }
    }
    return ans;
}



int main(){
    vector<int>stall_position={1,2,4,8,9};
    int acp=bestPosition(stall_position,3);
    cout<<"the best position is "<<acp<<endl;

}