#include<iostream>
#include<vector>
using namespace std;


bool linearsearchinmatrix(int matrix[][3],int rows,int coloumns,int key){
    for(int i=0;i<rows;i++){
        for(int j=0;j<coloumns;j++){
            if(matrix[i][j]==key){
                return true;
            }
        }
    }
    return false;
}


int main(){
    int matrix[3][3]={{1,2,3},{4,5,6},{7,8,9}};
    int key=9;
    cout<<linearsearchinmatrix(matrix,3,3,key)<<endl;
    return 0;
}