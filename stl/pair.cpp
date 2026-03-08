#include<iostream>
#include<vector>
using namespace std;


int main(){
    pair<int,int>p={1,1};

    // pair of pair

    pair<int,pair<string,int>>p1={1,{"aa",1}};

    cout<<p1.first<<endl;
    cout<<p1.second.first<<endl;
    cout<<p1.second.second<<endl;
    return 0;
}