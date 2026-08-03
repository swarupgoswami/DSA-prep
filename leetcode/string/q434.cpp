#include<iostream>
#include<vector>
#include<algorithm>
using namespace std;

int segmentsinsentence(string s){
    vector<string>ans;
    string str="";
    for(char ch: s){
        if(ch!=' '){
            str=str+ch;
        }
        else{
            if(!str.empty()){
                ans.push_back(str);
                str="";
            }
        }
    }
    if(!str.empty()){
        ans.push_back(str);
    }
    return ans.size();
};
int main(){
    string st="i love trees";
    cout<<" the segments in the string are :"<<segmentsinsentence(st)<<endl;
    return 0;

}