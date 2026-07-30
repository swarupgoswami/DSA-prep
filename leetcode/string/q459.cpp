#include<iostream>
#include<algorithm>
#include<vector>
using namespace std;

bool setsubstring(string s){
    int n=s.size();
    for(int len=1;len<=n/2;len++){
        if(n%len!=0) continue;

        string sub=s.substr(0,len);
        string ans="";
        for(int i=0;i<n/sub.size();i++){
            ans=ans+sub;
        }

        if(ans==s) return true;
    }
    return false;

};
int main(){
    string s="abab";
    bool issubstring=setsubstring(s);
    cout<<issubstring<<endl;
    return 0;
}