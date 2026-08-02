#include<iostream>
#include<vector>
#include<algorithm>
using namespace std;

string longestword(string s){
    string currentword="";
    string longestword="";
    for(int i=0;i<=s.size()-1;i++){
        if(s[i]==' '){
            if(currentword.size()>longestword.size()){
                longestword=currentword;
            }
            currentword="";
        }
        else{
            currentword=currentword+s[i];
        }
    }
    if(currentword.size()>longestword.size()){
        longestword=currentword;
    }
    return longestword;
}
int main(){
    string s;
    cout<<"enyter a sentence :";
    getline(cin,s);
    string ans=longestword(s);
    for(char ch:ans){
        cout<<ch;
    }
    cout<<" "<<endl;
    return 0;


}