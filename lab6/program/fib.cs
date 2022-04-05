using System;

namespace Fib
{
	class Fib
	{
		static void Main(string[] argv)
		{
			UInt16 r0, r1 = 1023, r4 = 2, r5 = 0, r6 = 1, r7 = 1;
			r0 = UInt16.Parse(Console.ReadLine());
			do
			{
				r5 = r4;
				r4 = (UInt16)(r4 + r7);
				r4 = (UInt16)(r4 + r7);
				r7 = r6;
				r6 = r5;
				r0 = (UInt16)(r0 - 1);
			}while (r0 > 0);
			r7 = (UInt16)(r7 & r1);
			Console.WriteLine(r7);
		}
	}
}