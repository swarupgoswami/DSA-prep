#include<iostream>
#include<vector>
#include<algorithm>
using namespace std;

string digitSum(string s, int k) {

        while (s.length() > k) {

            string temp = "";

            for (int i = 0; i < s.length(); i += k) {

                int sum = 0;

                for (int j = i; j < min(i + k, (int)s.length()); j++) {
                    sum += s[j] - '0';
                }

                temp += to_string(sum);
            }

            s = temp;
        }

        return s;
    }

int main(){
    string s="1111222233";
    int k=2;
    string ans=digitSum(s,k);
    cout<<ans<<endl;
    return 0;
}