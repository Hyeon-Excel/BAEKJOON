#include <iostream>
#include <string>
using namespace std;

int main() {
    int N;
    cin >> N;

    string numbers;
    cin >> numbers;

    int sum = 0;
    for (char c : numbers) {
        sum += c - '0';
    }

    cout << sum << '\n';
    return 0;
}