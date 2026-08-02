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
           int height=min(container[j],container[i]);
           int area=height*width;
           maxarea=max(area,maxarea);
        }
    }
    return maxarea;
}

int optimalmaxArea(vector<int>& height) {
        int maxwater=0;
        int n=height.size();
        int lp=0;
        int rp=n-1;
        while(lp<rp){
            int w=rp-lp;
            int h=min(height[lp],height[rp]);
            int currentwater=w*h;
            maxwater=max(currentwater,maxwater);
            height[lp]<height[rp]?lp++ : rp--;
        };
        return maxwater;
        
    }
int main(){
    

    vector<int>container={1,2,3,4,5,6};
    int maxwater=optimalmaxArea(container);
    cout<<"max wtaer in the conatiner is"<<maxwater<<endl;

}