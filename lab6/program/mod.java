import java.util.Scanner;

public class mod
{
	public static short r0, r1, r2, r3, r4;

	public static void Foo()
	{
		r2 = 0;
		r3 = 0;
		r4 = 0;
		r2 = (short)(r2 + 1);
		r3 = (short)(r3 + 8);
		do
		{
			if ((r3 & r1) != 0)
			{
				r4 = (short)(r2 + r4);
			}
			r2 = (short)(r2 + r2);
			r3 = (short)(r3 + r3);
		}while (r3 > 0);
	}

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		r1 = input.nextShort();
		do
		{
			Foo();
			r2 = (short)(r1 & 7);
			r1 = (short)(r2 + r4);
		}while (r1 - 7 > 0);
		if (r1 == 7)
		{
			r1 = (short)(r1 - 7);
		}
		System.out.print(r1);
	}
}