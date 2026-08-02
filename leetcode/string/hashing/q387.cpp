#include<iostream>
#include<vector>
#include<algorithm>
#include<unordered_map>
using namespace std;

int uniqueelement(string s){
   unordered_map<char,int>frequency;
   for(char ch: s){
    frequency[ch]++;
   }
   for(int i=0;i<=s.size()-1;i++){
    if(frequency[s[i]]==1){
        return i;
    }
   }
   return -1;
};
int main(){
    string name="ssam";
    cout<<uniqueelement(name)<<endl;

}