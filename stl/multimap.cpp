#include<iostream>
#include<vector>
#include<map>
using namespace std;

int main(){
    multimap<string,int>mulm;

    //cant use multim[] because here we can create multiple key 

    mulm.insert({"rolls royce",100});
    mulm.insert({"lambergini",50});
    mulm.insert({"lambergini",150});

    for(auto p:mulm){
        cout<<p.first<<" "<<p.second<<endl;
    }

    mulm.erase("lambergini");

    for(auto p:mulm){
        cout<<p.first<<" "<<p.second<<endl;
    }

    return 0;
}