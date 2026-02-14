#include<iostream>
#include<vector>
using namespace std;


int main(){
    int arr[]={1,2,3,4};
    

    // arr is itslef a constant pointer and it alway points(holds the address of the 0th element) towards the first element of the array



    cout<<arr<<endl;
    cout<<*arr<<endl;
    cout<<*(arr+1)<<endl;
    cout<<*(arr+2)<<endl;
    cout<<*(arr+3)<<endl;
}