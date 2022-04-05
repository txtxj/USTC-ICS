#include <cstdint>
#include <iostream>

using std::cin;
using std::cout;

int main(int argc, char* argv[])
{
	uint16_t r0, r1, r7 = 0;
	cin >> r0 >> r1;
	while (r1)
	{
		r7 = r7 + r0;
		r1 = r1 - 1;
	}
	cout << r7;
	return 0;
}