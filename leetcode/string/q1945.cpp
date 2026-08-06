#include<iostream>
#include<vector>
#include<algorithm>
using namespace std;

int stringconvert(string s,int k){
    int sum=0;
    for(char ch: s){
        int val=ch-'a'+1;
        while(val>0){
            sum=sum+val%10;
            val=val/10;

        }
    }

    while(--k){
        int newsum=0;
        while(sum>0){
            newsum+=sum%10;
            sum=sum/10;
        }
        sum=newsum;
    }
    return sum;
}
int main(){
    string str="zxba";
    int sub=stringconvert(str,2);
    cout<<"the sum of digits of string after convert is "<<sub<<endl;
}