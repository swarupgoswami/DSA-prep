#include<iostream>
#include<vector>
#include<stack>
using namespace std;

vector<int> nextGreater(vector<int>& arr) {
    int n = arr.size();
    vector<int> ans(n);

    stack<int> s;

    // Traverse from right to left
    for(int i = n - 1; i >= 0; i--) {

        // Pop smaller or equal elements
        while(!s.empty() && s.top() <= arr[i]) {
            s.pop();
        }

        // If stack empty, no greater element
        if(s.empty()) {
            ans[i] = -1;
        }
        else {
            ans[i] = s.top();
        }

        // Push current element
        s.push(arr[i]);
    }

    return ans;
}

int main() {

    vector<int> arr = {4, 5, 2, 10, 8};

    vector<int> result = nextGreater(arr);

    cout << "Next Greater Elements: " << endl;

    for(int i = 0; i < result.size(); i++) {
        cout << result[i] << " ";
    }

    return 0;
}