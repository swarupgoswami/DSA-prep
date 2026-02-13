#include <iostream>
#include <vector>
using namespace std;

// brute force approach
vector<int> productExceptSelf(vector<int> nums)
{
    vector<int> ans;
    for (int i = 0; i < nums.size(); i++)
    {
        int mul = 1;
        for (int j = 0; j < nums.size(); j++)
        {
            if (j == i)
            {
                continue;
            }
            else
            {
                mul = mul * nums[j];
            }
        };

        ans.push_back(mul);
    };
    return ans;
}

vector<int> optimalapproach(vector<int> nums){
    int n=nums.size();
        vector<int>ans(n,1);
        
        int prefix=1;
        int suffix=1;

      
        for(int i=1;i<n;i++){
            prefix=prefix*nums[i-1];
            ans[i]=prefix*ans[i];
            
        };
      
        for(int i=n-2;i>=0;i--){
            suffix=suffix*nums[i+1];
            ans[i]=suffix*ans[i];
        };
        return ans;
}

int main()
{
    vector<int>nums={1,2,3,4};
    vector<int> pro=optimalapproach(nums);
    for(int i=0;i<4;i++){
        cout<<"the product except itself array"<<pro[i]<<endl;
    };
    return 0;
}