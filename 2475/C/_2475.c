#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>

int main() {
	int a, b, c, d, e;
	scanf("%d %d %d %d %d", &a, &b, &c, &d, &e);

	int check = (a * a + b * b + c * c + d * d + e * e) % 10;
	printf("%d\n", check);

	return 0;
}