#include <stdint.h>
#include <stdio.h>

int main(int argc, char* argv[])
{
	uint16_t r0, r1, r2 = 1, r7 = 0;
	scanf("%hu %hu", &r0, &r1);
	while (r2)
	{
		if (r0 & r2)
		{
			r7 = r7 + r1;
		}
		r2 = r2 + r2;
		r1 = r1 + r1;
	}
	printf("%hu", r7);
	return 0;
}