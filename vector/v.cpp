#include<iostream>
#include<vector>
using namespace std;



// vector are ust like arrays but dynamic and cane be accesed like 

// vector<int> vec;
// vector<int>vec={1,2,3};
// vector<int>vec(3,0);

// g++ -std=c++11 code.cpp &&./a.exe


int main(){
  vector<int>v={1,2,3,4,5,6,7,8,9,10,11,12};
  for(int i=0;i<12;i++){
    cout<<v[i]<<endl;
  };
  

//   now printing the elemets of the vector using for ech loop

  for(int i:v){
    cout<<(12-i)<<endl;
  };

  vector<char> vec = {'s','w','a','r','a','m','a','r'};


  for(char i:vec){
    cout<<i<<endl;
  };
  return 0;

}