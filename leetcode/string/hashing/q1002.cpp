#include <iostream>
#include <vector>
#include <string>
#include <algorithm>
using namespace std;

vector<string> commonChars(vector<string>& words)
{
    vector<int> minFreq(26, 0);

    // Frequency of first word
    for (char ch : words[0])
    {
        minFreq[ch - 'a']++;
    }

    // Process remaining words
    for (int i = 1; i < words.size(); i++)
    {
        vector<int> currFreq(26, 0);

        for (char ch : words[i])
        {
            currFreq[ch - 'a']++;
        }

        for (int j = 0; j < 26; j++)
        {
            minFreq[j] = min(minFreq[j], currFreq[j]);
        }
    }

    vector<string> ans;

    for (int i = 0; i < 26; i++)
    {
        while (minFreq[i] > 0)
        {
            string temp = "";
            temp += char(i + 'a');
            ans.push_back(temp);
            minFreq[i]--;
        }
    }

    return ans;
}

int main()
{
    vector<string> words = {"bella", "label", "roller"};

    vector<string> ans = commonChars(words);

    for (string s : ans)
    {
        cout << s << " ";
    }

    return 0;
}