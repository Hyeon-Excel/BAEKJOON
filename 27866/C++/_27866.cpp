#include <iostream>
#include <string>
using namespace std;

int main() {
    string s;
    cin >> s;

    int i;
    cin >> i;

    cout << s[i - 1] << '\n';  // endl 대신 '\n'
    return 0;
}