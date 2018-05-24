#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <math.h>

int n, src = 1, dest = 3, temp = 2;

void TH(int n, int src, int dest, int temp) {
	if (n == 1) {
		printf("%d %d\n", src, dest);
	}
	else {
		TH(n - 1, src, temp, dest);
		TH(1, src, dest, temp);
		TH(n - 1, temp, dest, src);
	}
}

int main() {
	scanf("%d", &n);
	printf("%lld\n",(long long int) (pow(2, n) - 1));
	if(n <= 20)
		TH(n, src, dest, temp);
	return 0;
}