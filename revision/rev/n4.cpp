#include <iostream>
#include <cmath>
using namespace std;

bool armstrong(int n) {

    int original = n;
    int digits = 0;

    int temp = n;

    while (temp) {
        digits++;
        temp /= 10;
    }

    int sum = 0;

    temp = n;

    while (temp) {

        int digit = temp % 10;
        sum += pow(digit, digits);
        temp /= 10;
    }

    return sum == original;
}

int main() {

    int n = 153;

    if (armstrong(n))
        cout << "Armstrong";
    else
        cout << "Not Armstrong";
}