using namespace std;
#include <iostream>

int main() {
	int arr[5] = {};
	int multiplySum = 0;

	for (int i = 0; i < 5; i++) {
		cin >> arr[i];
		multiplySum += arr[i] * arr[i];
	}

	int testNum = multiplySum % 10;
	cout << testNum << endl;
}