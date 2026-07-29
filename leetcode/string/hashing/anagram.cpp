#include<iostream>
#include<vector>
#include<unordered_map>
#include<algorithm>
using namespace std;

bool anagram(string s,string t){
    unordered_map<char,int>frequency;
    for(auto ch:s){
        frequency[ch]++;
    }
    for(auto ch:t){
        frequency[ch]--;
    }

    for(auto freq:frequency){
        if(freq.second!=0) return false;
    }
    return true;

}
int main(){
    string s="anagram";
    string t="naagram";
    bool ana=anagram(s,t);
    cout<<"the given strings are anagram:"<<ana<<endl;
    return 0;
}