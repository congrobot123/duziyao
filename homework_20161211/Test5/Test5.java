public class Test5 
{
	public static void main(String[] args) 
	{
		int i = 0;
		int j = 0;

		for (i=1; i<5; ++i)
		{
			for (j=4-i; j>0; --j)
			{
				System.out.print(" ");
			}
			for (j=0; j<2*i-1; ++j)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		for (i=3; i>0; --i)
		{
			for (j=4-i; j>0; --j)
			{
				System.out.print(" ");
			}
			for (j=0; j<2*i-1; ++j)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
