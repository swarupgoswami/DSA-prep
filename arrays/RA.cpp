// using 2 pointer approach

// approach- here in the array we take two pointer(two variables)one to the strating index(0) and another to the last index(-1) and we wil keep moving the starting index to right and -lst index to left following the swap ;  


#include<iostream>
using namespace std;

void reverseArray(int arr[],int size){
    int start=0,end=size-1;

    while(start < end){
        swap(arr[start],arr[end]);
        start ++;
        end --;
    }
    
}

int main(){

    int arr[]={1,2,3,4};
    reverseArray(arr,4);

    for(int i=0;i<4;i++){
        cout<<arr[i];
    }
    cout<<endl;
    return 0;
    

}