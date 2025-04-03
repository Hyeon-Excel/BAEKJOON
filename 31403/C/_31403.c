#include <stdio.h>
#include <string.h>
#include <stdlib.h>

int main() {
    int A, B, C;
    char strA[6], strB[6], concat[12];

    scanf("%d %d %d", &A, &B, &C);

    printf("%d\n", A + B - C);

    sprintf(strA, "%d", A);
    sprintf(strB, "%d", B);
    strcpy(concat, strA);
    strcat(concat, strB);

    printf("%d\n", atoi(concat) - C);
    return 0;
}