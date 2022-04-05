global r0, r1
r0 = 0
r1 = 5

def Foo():
	global r0, r1
	r0 = r0 + 1
	r1 = r1 - 1
	if r1 != 0:
		Foo()

Foo()
# no output