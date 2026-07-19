#include <bits/stdc++.h>
using namespace std;

int main()
{
    vector<int> arr = {1,1,2,2,3,4,4,5};

    int n = arr.size();

    if(n == 0)
        return 0;

    int i = 0;

    for(int j = 1; j < n; j++)
    {
        if(arr[i] != arr[j])
        {
            i++;
            arr[i] = arr[j];
        }
    }

    cout << "Unique Elements: ";

    for(int k = 0; k <= i; k++)
        cout << arr[k] << " ";

    cout << "\nLength = " << i + 1;

    return 0;
}