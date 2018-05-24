#include <stdio.h>

int Multiplication(int n, int m);

int main() {
	int n = 9, m = 9;
	printf("Multiplication %d * %d = %d\n", n, m, Multiplication(n, m));
	return 0;
}

int Multiplication(int n, int m) {
	int retValue = 0;
	__asm {
		mov eax, n
		mul m
		mov retValue, eax
	}
	return retValue;
}