#include<bits/stdc++.h>
using namespace std;

int main()
{
    vector<int> arr = {4,2,7,2,4,8,1,7};

    unordered_set<int> seen;

    vector<int> ans;

    for(int x : arr)
    {
        if(seen.find(x) == seen.end())
        {
            ans.push_back(x);
            seen.insert(x);
        }
    }

    for(int x : ans)
        cout << x << " ";

    return 0;
}