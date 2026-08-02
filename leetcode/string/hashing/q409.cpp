#include<iostream>
#include<vector>
#include<unordered_map>
#include<algorithm>
using namespace std;
int longestpallindrome(string s){
    unordered_map<char,int>frequency;
    int count=0;
    int c=0;
    for(char ch:s){
        frequency[ch]++;
    }
    for(auto x:frequency){
        if(x.second%2==0){
            count=count+x.second;
        }
        else{
            c++;
            count=count+x.second-1;
        }
    }
    if(c>0){
        count++;
    }
    return count;
};
int main(){
    string a="abccccdd";
    cout<<"longest pallindrome "<<longestpallindrome(a)<<endl;
    return 0;

}