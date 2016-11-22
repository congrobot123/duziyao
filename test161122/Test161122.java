import java.util.Scanner;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

public class Test161122 
{
	public static HashSet suiji(int n)
	{
		Random ra = new Random();
		HashSet ha = new HashSet();
		for(int i=0; i<n; i++)
			ha.add((Object)ra.nextInt());
		return ha;
	}

	public static int[] paixu(Iterator it,int n)
	{
		int[] a = new int [n];
		int i = 0,x;
		while(it.hasNext())
		{
			a[i] = (int)it.next(); 
			i++;
		}
		for(i=0; i<n; i++)
			for(int j=n-1; j>i; j--)
			{
				if(a[j] > a[j-1])
				{
					x = a[j]; 
					a[j] = a[j-1];
					a[j-1] = x;
				}
			}			

		System.out.println("从大到小排列：");
		for(int temp : a)
			System.out.print(temp+" ");
		System.out.println();
		return a;
	}

	public static void pingjun(int[] a)
	{
		int sum = 0;
		for(int temp : a)
			sum = sum + temp;
		System.out.println("集合中的数的平均值为："+(double)sum/a.length);
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		HashSet ha = new HashSet();
		ha = suiji(n);
		Iterator it1 = ha.iterator();
		System.out.println("集合中的元素为：");
		it1.forEachRemaining(obj -> System.out.print(obj+" "));
		System.out.println();

		Iterator it2 = ha.iterator();
		int[] a = paixu(it2,n);

		pingjun(a);
	}
}
