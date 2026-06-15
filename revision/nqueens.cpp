#include<iostream>
#include<vector>
using namespace std;


bool issafe(vector<string>& board,int row,int col, int n) {
        
        // same column
        for(int i = 0; i < row; i++) {
            if(board[i][col] == 'Q') return false;
        }

        // left diagonal
        for(int i = row-1, j = col-1; i >= 0 && j >= 0; i--, j--) {
            if(board[i][j] == 'Q') return false;
        }

        // right diagonal
        for(int i = row-1, j = col+1; i >= 0 && j < n; i--, j++) {
            if(board[i][j] == 'Q') return false;
        }

        return true;
}


void nqueen(vector<string>&board,vector<vector<string>>&ans,int row,int n){
    if(row==n){
        ans.push_back(board);
        return;
    }

    for(int j=0;j<n;j++){
        if(issafe(board,row,j,n)){
            board[row][j]='Q';
            nqueen(board,ans,row+1,n);
            board[row][j]='.';

        }

    }

}



//for each recursive call we are placinf the q to each coloumn places which are valid and then we call the same recusrive function to giving the next row as row argument to place the next queen to place in the next valid row and coloumn 


//and inside the if block in an entire row doest have any valid coloumn to place the q it end the lopp and themoves the previous call stack and resumes from there it puts the . again(backtracking).
int main(){
     int n = 4;

    vector<string> board(n, string(n, '.'));

    vector<vector<string>> ans;

    nqueen(board, ans, 0, n);

    for(auto solution : ans) {
        cout << "Solution:\n";
        for(auto row : solution) {
            cout << row << endl;
        }
        cout << endl;
    }
    return 0;

}