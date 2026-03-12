#include<iostream>
#include<vector>
using namespace std;


int primebetweenrange(int n){
    vector<bool> isprimes(n+1,true);
    //it creates a vector of size n which has each elemnt true;
    int count=0;
    for(int i=2;i<n;i++){
       if(isprimes[i]){
        count++;
       }
       for(int j=i*2;j<n;j=j+i){
        isprimes[j]=false;
       }
    }
    return count;
}

int main(){
    cout<<primebetweenrange(50)<<endl;
    return 0;

}