#include<iostream>
#include<vector>
#include<stack>
using namespace std;

class StockSpanner {
public:

    vector<int> prices;
    stack<int> s;

    StockSpanner() {

    }

    int next(int price) {

        prices.push_back(price);

        int i = prices.size() - 1;

        while (!s.empty() && prices[s.top()] <= prices[i]) {
            s.pop();
        }

        int span;

        if (s.size() == 0) {
            span = i + 1;
        }
        else {
            span = i - s.top();
        }

        s.push(i);

        return span;
    }
};

int main() {

    vector<int> prices = {100, 80, 60, 70, 60, 75, 85};

    vector<int> ans;

    StockSpanner obj;

    for (int i = 0; i < prices.size(); i++) {
        ans.push_back(obj.next(prices[i]));
    }

    for (int i = 0; i < ans.size(); i++) {
        cout << ans[i] << " ";
    }

    return 0;
}