#include<iostream>
using namespace std;

int main(){
    int array1[5]={1,2,3,4,5};
    double array2[5];
    // return 0;

    // for (int i=0;i<5;i++){
    //     array1[i]=array1[i]+1;
    //     cout<<array1[i]<<endl;
    // };
    // return 0;

    int array3[10];

    for (int i=0;i<10;i++){
        cin>>array3[i];
    };
    for (int i=1;i<10;i++){
        cout<<array3[10-i]<<endl;
    };
    return 0;

}