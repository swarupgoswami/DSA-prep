#include<iostream>
using namespace std;

int linear_search(int arr[],int size,int target){

    for (int i=0;i<=size-1;i++){
        if(arr[i]==target){
            return i;
        }
    }

    return -1;
}



int main(){

    int arry[]={1,2,3,4,5,6};
    int target=6;
    int size=sizeof(arry)/sizeof(arry[0]);

    int targetindex=linear_search(arry, size, target);
    cout<<targetindex;
    return 0;
}