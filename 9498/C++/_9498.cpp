using namespace std;
#include <iostream>

int main(){
    int score;
    cin >> score;

    if(score >= 90){
        cout << "A" << endl;
    }
    else if(score >= 80 && score < 90){
        cout << "B" << endl;
    }
    else if(score >= 70 && score < 80){
        cout << "C" << endl;
    }
    else if(score >= 60 && score < 70){
        cout << "D" << endl;
    }
    else cout << "F" << endl;
}