#include <iostream>
#include <vector>
#include <climits>
using namespace std;

int closestprimeinrange(int left, int right)
{

    
    vector<bool> isprime(right + 1, true);
    int minimumdiffernce = INT_MAX;
    

    for (int i = 2; i < right + 1; i++)
    {
        if (isprime[i])
        {
            for (int j = i * i; j < right + 1; j = j + i)
            {
                isprime[j] = false;
            }
        }
    }
    // so upto here the all the prime numbers are marked as true in the range of(0 to right) the sieve is created

    // now a loop for the prime numbers between the given range(left to right)

    int prev=-1;


    for(int j=left;j<right+1;j++){
        if(isprime[j]){
          if(prev!=-1){
            minimumdiffernce=min(minimumdiffernce,j-prev);
          }
          prev=j;
        }
    }

    if(minimumdiffernce==INT_MAX) return -1;

    return minimumdiffernce;

    
}

int main(){

    int diff=closestprimeinrange(10,20);
    cout<<diff<<endl;
    return 0;
}