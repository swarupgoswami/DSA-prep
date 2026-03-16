#include<iostream>
#include<vector>
#include<set>
using namespace std;

int main(){
    set<int>s;

    //set avoind multiple smae value insertion and return data in sorted manner and uses self balancing tree under the hood and because of that it time complexity of(ologn) 

    //set also has two types like map ordered and unorderd set and has similar tim cmplxity 

    //unordered set is used for it s constant time complexity;

    s.insert(1);
    s.insert(2);
    s.insert(3);
    s.insert(4);

    for(auto p:s){
        cout<<p<<endl;
    }
    cout<<endl;
    return 0;
}