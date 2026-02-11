#include<iostream>
#include<vector>
using namespace std;

int maxprofit(vector<int>prices){
        int mp=0;
        // assuming the max price to be 0 intially
        int bestBuy=prices[0];
        // assuming the best buy the first elemnt of the array
        int n=prices.size();

        // starting the array from the second elemnt cause we already have the first element in th bestbuy;
        for(int i=1;i<n;i++){

            // comparing the next price from the current pirce
            // here prices[i denotes the best seeling price]
            if(prices[i]>bestBuy){
                mp=max(mp,prices[i]-bestBuy);

            };
            bestBuy=min(bestBuy,prices[i]);
        };
        return mp;
    
}


int main(){
     
    vector<int>prices={7,1,5,3,6,4};

    int max_pro=maxprofit(prices);
    cout<<"the max profit of elling the stock is :"<<max_pro<<endl;
}