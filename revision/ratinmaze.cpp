#include<iostream>
#include<vector>
using namespace std;


void ratinmazedirection(int row,int col,int n,vector<vector<int>>&maze,vector<string>&ans,string path){
    if(row<0 || col<0 || row>=n || col>=n){
    return;
    }
    if(row==n-1 && col==n-1){
        ans.push_back(path);
        return;
        
    }
    maze[row][col]=0;
    
    if(row+1<=n-1 && maze[row+1][col]==1){
        ratinmazedirection(row+1,col,n,maze,ans,path+"D");
    }
    if(row-1>=0 && maze[row-1][col]==1){
        ratinmazedirection(row-1,col,n,maze,ans,path+"U");
    }
    if(col+1<=n-1 && maze[row][col+1]==1){
        ratinmazedirection(row,col+1,n,maze,ans,path+"R");
    }
    if(col-1>=0 && maze[row][col-1]==1){
        ratinmazedirection(row,col-1,n,maze,ans,path+"L");
    }
    maze[row][col]=1;

}

int main(){
    vector<vector<int>> maze = {
        {1,0,0,0},
        {1,1,0,1},
        {1,1,0,0},
        {0,1,1,1}
    };
    int n=maze.size();
    vector<string>ans;
    string path="";

    ratinmazedirection(0,0,n,maze,ans,path);

    for(string s:ans){
        cout<<s<<endl;
    }
    
    return 0;
}