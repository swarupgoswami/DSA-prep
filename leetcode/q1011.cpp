#include<iostream>
#include<vector>
#include <algorithm>
using namespace std;

bool isValid(vector<int>&weights, int days, int maximumcapcity){
    int Dayused=1,currentweight=0;
    for(int i=0;i<weights.size();i++){
        if(currentweight+weights[i]<= maximumcapcity){
            currentweight=currentweight+weights[i];
        }
        else{
            Dayused++;
            currentweight=weights[i];
        }
    }
    if(Dayused <= days){
        return true;
    }
    else{
        return false;
    }
}



// in this problem it is said to find the minimum cpacity of ship to complete the shipping with d days 
// so here we will apply binary serach on the range of capacity by calcualting the minimum cpacity and max cpapcity 

int minimumcapacity(vector<int>&weights, int days){
    int start=*max_element(weights.begin(),weights.end());
    int end=0;
    for(int i=0;i<weights.size()-1;i++){
        end=end+weights[i];
    };
    int ans=-1;
    while(start<=end){
        int mid=start+(end-start)/2;
        if(isValid(weights,days,mid)){
            // if the assumed mid is truely the mxed capcity then we move to the right of the search space cause we need the minimum valid capcity;
            ans=mid;
            end=mid-1;
        }
        else{
            start=mid+1;
        }
    }
    return ans;
}




int main(){
     vector<int>weights={3,2,2,4,1,4};
     int days = 3;
     int mincapacity=minimumcapacity(weights,days);
     cout<<"minim capcity is "<<mincapacity<<endl;
}