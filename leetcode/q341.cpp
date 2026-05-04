#include <iostream>
#include <vector>
#include <stack>
using namespace std;


class NestedInteger {
    bool is_int;
    int value;
    vector<NestedInteger> list;

public:
   
    NestedInteger(int val) {
        is_int = true;
        value = val;
    }

   
    NestedInteger(vector<NestedInteger> lst) {
        is_int = false;
        list = lst;
    }

    bool isInteger() const {
        return is_int;
    }

    int getInteger() const {
        return value;
    }

    const vector<NestedInteger>& getList() const {
        return list;
    }
};


class NestedIterator {
    stack<NestedInteger> st;

public:
    NestedIterator(vector<NestedInteger>& nestedList) {
     
        for (int i = nestedList.size() - 1; i >= 0; i--) {
            st.push(nestedList[i]);
        }
    }

    int next() {
        int val = st.top().getInteger();
        st.pop();
        return val;
    }

    bool hasNext() {
        while (!st.empty()) {
            NestedInteger curr = st.top();

            if (curr.isInteger()) {
                return true;
            }

            st.pop();
            vector<NestedInteger> lst = curr.getList();

            
            for (int i = lst.size() - 1; i >= 0; i--) {
                st.push(lst[i]);
            }
        }
        return false;
    }
};

int main() {

  

    NestedInteger n1(1);

    NestedInteger n3(3);
    NestedInteger n4(4);
    vector<NestedInteger> inner2 = {n3, n4};
    NestedInteger n2(inner2); // [3,4]

    vector<NestedInteger> inner1 = {NestedInteger(2), n2};
    NestedInteger nNested(inner1); // [2,[3,4]]

    NestedInteger n5(5);

    vector<NestedInteger> nestedList = {n1, nNested, n5};


    NestedIterator it(nestedList);

    cout << "Flattened List: ";
    while (it.hasNext()) {
        cout << it.next() << " ";
    }

    return 0;
}