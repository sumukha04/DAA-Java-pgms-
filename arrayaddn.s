	area array, code, readonly
	entry
	mov r1, #3
	mov r2, #0x40000000
	ldr r3, [r2]
loop
	add r2, #4
	ldr r4, [r2]
	add r3, r4
	sub r1, #1
	cmp r1, #0
	bne loop
	mov r5, #0x4000001C
	str r3, [r5]
	end