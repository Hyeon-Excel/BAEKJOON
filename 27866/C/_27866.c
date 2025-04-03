#include <stdio.h>

int main() {
    int i;
    char word[1001];  // 최대 1000자 + 널문자

    scanf("%s", word);
    scanf("%d", &i);

    printf("%c\n", word[i - 1]);
    return 0;
}
