#include <stdio.h>

int Sum(int n);

int main() {
	int n = 9;
	printf("Sum 1 ~ %d = %d\n", n, Sum(n));
	return 0;
}

int Sum(int n) {
	int retValue = 0;
	__asm {
			mov ecx, n
			mov eax, 0
		L1:
			add eax, ecx
			loop L1
			mov retValue, eax
	}
	return retValue;
}