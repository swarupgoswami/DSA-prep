#include<iostream>
#include<vector>
using namespace std;


// here a grid (n*n matrix) will be given  and we have to return true of false knight tour configuration 


bool isValid(vector<vector<int>>&grid,int r,int c,int expvalue){

   int n = grid.size();

        // Boundary + value check
        if (r < 0 || c < 0 || r >= n || c >= n || grid[r][c] != expvalue)
            return false;

        // Base case
        if (expvalue == n * n - 1)
            return true;

        // All 8 knight moves
        bool a1 = isValid(grid, r-2, c+1, expvalue+1);
        bool a2 = isValid(grid, r-1, c+2, expvalue+1);
        bool a3 = isValid(grid, r+1, c+2, expvalue+1);
        bool a4 = isValid(grid, r+2, c+1, expvalue+1);
        bool a5 = isValid(grid, r+2, c-1, expvalue+1);
        bool a6 = isValid(grid, r+1, c-2, expvalue+1);
        bool a7 = isValid(grid, r-1, c-2, expvalue+1);
        bool a8 = isValid(grid, r-2, c-1, expvalue+1);

        return (a1 || a2 || a3 || a4 || a5 || a6 || a7 || a8);
    

}


int main(){
    vector<vector<int>> grid = {
        {0, 11, 16, 5, 20},
        {17, 4, 19, 10, 15},
        {12, 1, 8, 21, 6},
        {3, 18, 23, 14, 9},
        {24, 13, 2, 7, 22}
    };

    bool ans = isValid(grid, 0, 0, 0);

    if(ans){
        cout << "Valid Knight Tour" << endl;
    } else {
        cout << "Invalid Knight Tour" << endl;
    }

    return 0;
}