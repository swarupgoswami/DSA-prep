#include<iostream>
#include<vector>
using namespace std;


// container with most wtaer 


// brute force  approach
// in this we take all the combinateion of left line and right line and calculate all their area and keep comparing their area with their [previous area of each iteration 

int mostwaterContainer(vector<int> container ){
    int n=container.size();
    int maxarea=0;
    for(int i=0;i<n;i++){
        for(int j=i+1;j<n;j++){
           int width=j-i;
           int height=min(j,i);
           int area=height*width;
           maxarea=max(area,maxarea);
        }
    }
    return maxarea;
}
int main(){
    

    vector<int>container={1,2,3,4,5,6};

}