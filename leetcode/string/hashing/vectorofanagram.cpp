#include<iostream>
#include<vector>
#include<algorithm>
#include<unordered_map>
using namespace std;
vector<vector<string>> anagram(vector<string>&strs){
    unordered_map<string,vector<string>>frequency;
    vector<vector<string>>ans;
    for(auto st: strs){
        string key=st;
        sort(key.begin(),key.end());
        frequency[key].push_back(st);
    }
    for(auto a:frequency){
        ans.push_back(a.second);
    }
    return ans;
}
int main(){
    vector<string>strs = {"eat","tea","tan","ate","nat","bat"};
    vector<vector<string>>ans=anagram(strs);
    for(auto a:ans){
        for(auto b:a){
            cout<<b<<" ";
        }
        cout<<" "<<endl;
    }
    return 0;
}