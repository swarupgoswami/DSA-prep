#include<iostream>
#include<unordered_map>
#include <vector>
using namespace std;

int main(){
    unordered_map<string,int>m;

    //randomly unsorted map and multiple same key can not be made and the benifits is that it uses 0(n) time complexity for insert find count and erase 

    m.emplace("car",50);
    m.emplace("airplane",50);
    m.emplace("jet",50);
    m.emplace("villa",50);

    for(auto p: m){
        cout<<p.first<<" "<<p.second<<endl;
    }

    return 0;

}