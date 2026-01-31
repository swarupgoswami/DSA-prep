#include<iostream>
using namespace std;

int main(){
    
    int number;
    cout<<"enter a number";
    cin>>number;

    while(number>0 && number <=10){
        number ++;
        cout<<number<<endl;
    }

    cout<<"loops end"<<endl;
    return 0;
}