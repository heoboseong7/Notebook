TITLE Template_16bit

.MODEL small
.STACK 100h
.386

.data
message BYTE "Hello, Name", 0dh, 0ah

.code

main PROC
	mov ax, @data
	mov ds, ax

	mov ah, 40h
	mov bx, 1
	mov cx, SIZEOF message
	mov dx, OFFSET message
	int 21h

	.EXIT

main ENDP
END main