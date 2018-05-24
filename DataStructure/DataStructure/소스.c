#define numRow 10
#define numCol 10
#define EXIT_ROW 9
#define EXIT_COLUMN 9
#include <stdio.h>
#include <stdbool.h>
int top;
int st[10001] = { 0, };

void stpop() {
	top--;
}

void stpush(int a) {
	st[top + 1] = a;
	top++;
}

int stback() {
	return st[top];
}

bool stempty() {
	if (top < 0)
		return true;
	else
		return false;
}

void setup_maze() {
	short int maze[numRow][numCol] = {
		{ 0,0,1,0,1,1,1,0,1,0 },
		{ 1,0,0,1,1,1,0,1,0,1 },
		{ 1,1,0,1,1,0,1,0,1,1 },
		{ 0,0,1,1,1,0,1,0,0,0 },
		{ 0,1,1,1,1,0,1,0,1,0 },
		{ 1,0,1,1,0,1,1,0,1,0 },
		{ 1,1,0,1,0,1,0,0,1,0 },
		{ 1,0,1,0,1,0,1,0,0,0 },
		{ 0,1,0,1,1,1,0,1,1,0 },
		{ 1,0,0,1,1,1,0,0,0,0 }
	};
}

int main() {
	setup_maze();

}