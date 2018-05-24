#include <stdio.h>

void Factorial(int a);

int main(void) {
	int a = 4;
	Factorial(a);
	return 0;
}

void Factorial(int a) {
	int sum;
	__asm{
		mov ecx, a
		mov sum, 1
		L1:
			mov eax, sum
			mul ecx
			mov sum, eax
			loop L1
	}
	printf("Factorial %d!= %d\n", a, sum);
}