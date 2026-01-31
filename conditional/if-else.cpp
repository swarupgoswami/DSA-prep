#include<iostream>
using namespace std;

int main() {
    int age;
    cout<<"enter you age:";
    cin>>age;

    if(age % 2 ==0){
        cout<<"you age is even"<<endl;
    }else{
        cout<<"your age is odd"<<endl;
    };
    return 0;
}