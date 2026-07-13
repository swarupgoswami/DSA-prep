#include <iostream>
using namespace std;

int main() {

    int a = 2;
    int d = 3;
    int number = 5;

    int sum = number * (2 * a + (number - 1) * d) / 2;

    cout << sum;
}