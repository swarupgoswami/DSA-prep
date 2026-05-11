#include<iostream>
#include<vector>
using namespace std;

class Solution {
public:
    int trap(vector<int>& height) {
        int n = height.size();

        vector<int> lmax(n);
        vector<int> rmax(n);

        // Fill lmax vector
        lmax[0] = height[0];
        for(int i = 1; i < n; i++) {
            lmax[i] = max(lmax[i - 1], height[i]);
        }

        // Fill rmax vector
        rmax[n - 1] = height[n - 1];
        for(int i = n - 2; i >= 0; i--) {
            rmax[i] = max(rmax[i + 1], height[i]);
        }

        // Calculate trapped rain water
        int water = 0;

        for(int i = 0; i < n; i++) {
            water += min(lmax[i], rmax[i]) - height[i];
        }

        return water;
    }
};

int main() {

    vector<int> height = {0,1,0,2,1,0,1,3,2,1,2,1};

    Solution obj;

    int ans = obj.trap(height);

    cout << "Total trapped rain water = " << ans << endl;

    return 0;
}