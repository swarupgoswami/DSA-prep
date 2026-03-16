#include<iostream>
#include<vector>
#include <map>
using namespace std;



int main(){
    map<string,int>m;

    m["car"]=50;
    m["bike"]=100;
    m["bus"]=50;

    m.insert({"van",100});
    m.emplace("airplanes",50);

    if(m.find("bike")!=m.end()){
        cout<<"found"<<endl;
    }
    else{
        cout<<"not found"<<endl;
    }
    
    for(auto p:m){
        cout<<p.first<<" "<<p.second<<endl;
        cout<<"count of no.of key of car "<<m.count("car")<<endl;
        
    }
    return 0;
}