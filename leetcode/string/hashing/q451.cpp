#include<iostream>
#include<vector>
#include<algorithm>
#include<unordered_map>
using namespace std;

string sortfrequencychar(string s){

    unordered_map<char,int>frequency;
    for(auto x:s){
        frequency[x]++;
    }
    vector<pair<char,int>>ans;
    for(auto x:frequency){
        ans.push_back(x);
    }
    sort(ans.begin(),ans.end(),[](pair<char,int>a,pair<char,int>b){
        return a.second>b.second;
    });
    string st="";
    for(auto x:ans){
        st.append(x.second,x.first);
    };
    return st;

};

int main(){
    string s="tree";
    string a=sortfrequencychar(s);
    for(char ch:a){
        cout<<ch<<" ";
    }
    return 0;
}
