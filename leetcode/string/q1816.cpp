#include<iostream>
#include<vector>
#include<algorithm>
using namespace std;

string truntuatesentence(string s,int k){
    int count=0;
    for(int i=0;i<=s.size()-1;i++){
        if(s[i]==' ') count++;
        if(count==k){
            return s.substr(0,i);
        }
    }
    return s;
}
int main(){
    string s="i love trees and herbs";
    string newstr=truntuatesentence(s,2);
    cout<<newstr<<endl;
    return 0;

}