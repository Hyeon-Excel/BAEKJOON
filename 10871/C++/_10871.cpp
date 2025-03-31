using namespace std;
#include <iostream>

int main(){
    int N, X;
    cin >> N >> X;

    int *arr = new int[N];
    for(int i = 0; i < N; i++){
        cin >> arr[i];
    }
    for(int i = 0; i < N; i++){
        if(arr[i] < X){
            cout << arr[i] << " ";
        }
    }
    delete arr;
    return 0;
}