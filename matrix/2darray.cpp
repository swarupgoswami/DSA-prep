#include<iostream>
#include<vector>
using namespace std;


int main(){

    // intializing a matrix with 4 rows and 3 coloumns
    int matrix[4][3];

    // intializing another matrix with values in it 
    int matrix2[3][3]={{1,2,3},{4,5,6},{7,8,9}};

    // getting output from the matrix
    int rows=3;
    int coloumns=3; 
    for(int i=0;i<rows;i++){
        for(int j=0;j<coloumns;j++){
            cout<<matrix2[i][j]<<" ";
        }
        cout<<endl;
    }
   

    // taking input in th empty matrix
    for(int i=0;i<rows;i++){
        for(int j=0;j<coloumns;j++){
           cin>>matrix[i][j];
        }
    }

     for(int i=0;i<4;i++){
        for(int j=0;j<coloumns;j++){
           cout<<matrix[i][j];
        }
        cout<<endl;
    }

     return 0;
}