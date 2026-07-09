#include <iostream>
using namespace std;

bool prime(int n) {

    if (n <= 1)
        return false;

    for (int i = 2; i * i <= n; i++) {

        if (n % i == 0)
            return false;
    }

    return true;
}

int main() {

    int start = 10;
    int end = 50;

    for (int i = start; i <= end; i++) {

        if (prime(i))
            cout << i << " ";
    }

}