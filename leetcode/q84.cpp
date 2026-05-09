#include <iostream>
#include <vector>
#include <stack>
using namespace std;

vector<int> nextSmallerRight(vector<int>& heights) {
    int n = heights.size();
    vector<int> right(n);
    stack<int> s;

    for (int i = n - 1; i >= 0; i--) {

        while (!s.empty() && heights[s.top()] >= heights[i]) {
            s.pop();
        }

        if (s.empty()) {
            right[i] = n;
        }
        else {
            right[i] = s.top();
        }

        s.push(i);
    }

    return right;
}

vector<int> nextSmallerLeft(vector<int>& heights) {
    int n = heights.size();
    vector<int> left(n);
    stack<int> s;

    for (int i = 0; i < n; i++) {

        while (!s.empty() && heights[s.top()] >= heights[i]) {
            s.pop();
        }

        if (s.empty()) {
            left[i] = -1;
        }
        else {
            left[i] = s.top();
        }

        s.push(i);
    }

    return left;
}

int largestRectangleArea(vector<int>& heights) {

    int n = heights.size();

    vector<int> left = nextSmallerLeft(heights);
    vector<int> right = nextSmallerRight(heights);

    int maxArea = 0;

    for (int i = 0; i < n; i++) {

        int width = right[i] - left[i] - 1;

        int area = heights[i] * width;

        maxArea = max(maxArea, area);
    }

    return maxArea;
}

int main() {

    vector<int> heights = {2, 1, 5, 6, 2, 3};

    int ans = largestRectangleArea(heights);

    cout << "Largest Rectangle Area = " << ans << endl;

    return 0;
}