#include<iostream>
#include<deque>
using namespace std;


int main(){
    deque<int>d;

    // implemneted same as vector and list 

    d.emplace_back(1);
    d.push_back(3);
    d.push_front(4);
    d.push_front(5);

    d.pop_back();
    d.pop_front();

    for(int val :d){
        cout<<val<<" ";
    };
    cout<<endl;
    return 0;

}