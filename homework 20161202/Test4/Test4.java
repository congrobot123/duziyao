public class Test4 
{
	public static void main(String[] args) 
	{
		int[] a = {0,1,2,3,4,5,6,7,8,9};
		for(int temp : a)
		{
			System.out.print(temp+" ");
		}
		System.out.println();
		int b;

		for (int i=0; i<(a.length/2); i++)
		{
			b = a[i];
			a[i] = a[a.length-i-1];
			a[a.length-i-1] = b;
		}
		for (int temp : a )
		{
			System.out.print(temp+" ");
		}
	}
}
