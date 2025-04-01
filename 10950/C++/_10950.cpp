using namespace std;
#include <iostream>

int main(){
    int T;
    cin >> T;

    int *arr = new int[T];
    for(int i = 0; i < T; i++){
        int A, B;
        cin >> A >> B;
        arr[i] = A + B;
    }
    for(int i = 0; i < T; i++){
        cout << arr[i] << endl;
    }
    delete arr;
    return 0;
}