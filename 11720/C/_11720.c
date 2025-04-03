#include <stdio.h>

int main() {
    int N;
    scanf("%d", &N);

    char nArr[101];  // 문제 제한: 최대 100자리 + 널 문자
    scanf("%s", nArr);

    int sum = 0;
    for (int i = 0; i < N; i++) {
        sum += nArr[i] - '0';
    }

    printf("%d\n", sum);
    return 0;
}
