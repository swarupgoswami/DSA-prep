#include<iostream>
using namespace std;

int main(){
    int n;
    cout<<"enter all the numbers";
    cin>>n;
    // sum of all odd numbers from 1 to n
    int sum=0;
    for(int i=1;i<=n;i++){
        if(i%2!=0){
            sum=sum+i;

        }else{
            continue;
        }
    }
    cout<<"sum of all odd numeber "<<sum<<endl;
    return 0;
}