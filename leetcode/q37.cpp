#include<iostream>
#include<vector>
using namespace std;


bool isvalid(vector<vector<char>>&board,int rows,int coloumns,char num){
    for(int digit = 0; digit < 9; digit++){

        if(board[rows][digit] == num) return false;

        if(board[digit][coloumns] == num) return false;

        int r = 3 * (rows / 3) + digit / 3;
        int c = 3 * (coloumns / 3) + digit % 3;

        if(board[r][c] == num) return false;
    }
    return true;
}


bool sudokusolver(vector<vector<char>>&board,int rows,int coloumns){
    // base case
    if(rows==9) return true;
    int nextrows=rows;
    int nextcol=coloumns+1;

    if(nextcol==9){
        nextrows=rows+1;
        nextcol=0;
    }

    if(board[rows][coloumns] != '.'){
        return sudokusolver(board, nextrows, nextcol);
    }
    // at ecah recursive check the digit is vallid or not and if valid then put it in the cell
    for(char i='1';i<='9';i++){
        // checking the digit is valid or not 
        if(isvalid(board,rows,coloumns,i)){
            // placing the digit in the cell
            board[rows][coloumns]=i;
            // call the recursive function for nextrows and coloumns
            // putting it inside the if block because to chack if the next elemnt will be valid or not 
            if(sudokusolver(board,nextrows,nextcol)){
                return true;
            }
            // backtracking step
            // this step is only executed when the above recusrive call ends which means it returns false 
            board[rows][coloumns]='.';
            
        }
    }
    return false;
}

int main(){
    vector<vector<char>> board = {
        {'5','3','.','.','7','.','.','.','.'},
        {'6','.','.','1','9','5','.','.','.'},
        {'.','9','8','.','.','.','.','6','.'},

        {'8','.','.','.','6','.','.','.','3'},
        {'4','.','.','8','.','3','.','.','1'},
        {'7','.','.','.','2','.','.','.','6'},

        {'.','6','.','.','.','.','2','8','.'},
        {'.','.','.','4','1','9','.','.','5'},
        {'.','.','.','.','8','.','.','7','9'}
    };

    sudokusolver(board, 0, 0);

    // print result
    for(int i = 0; i < 9; i++){
        for(int j = 0; j < 9; j++){
            cout << board[i][j] << " ";
        }
        cout << endl;
    }

    return 0;

}