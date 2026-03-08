#include<iostream>
#include<vector>
using namespace std;


int main(){
    vector<int>nums={1,2,3,4};
    // nums.erase(nums.begin());
    nums.push_back(5);
    nums.erase(nums.begin()+2);

    // the erase(), insert() function are given with .begin()function as its parameter;
    
    nums.insert(nums.begin()+2,100);
    

    for(int val:nums){
        cout<<" "<<val<<endl;
    };

    cout<<"    "<<*(nums.begin())<<endl;
    cout<<*(nums.end())<<endl;
    return 0;

    // iterators

    // nums.begin(); --> points to the location in memory where from where the first element in the vector

    // if we use derefrence operator it will return the first lemnt of the vector

    // nums.end(); --> points to the next location which is next to the last lement;


}