.386
.model flat

.code
_Factorial PROC

push ebp
mov ebp, esp

mov ecx, [ebp + 8]
mov eax, 1
L1 :
	mul ecx
	loop L1