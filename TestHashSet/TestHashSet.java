import java.util.Scanner;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

public class TestHashSet 
{
	static HashSet hashset = new HashSet();

	public static HashSet random(int n)
	{
		Random random = new Random();
		
		for(int i=0; i<n; i++)
			hashset.add((Object)random.nextInt());
		return hashset;
	}

	public static int[] sort(int n)
	{
		Iterator iterator = hashset.iterator();
		int[] a = new int [n];
		int i = 0,x;
		while(iterator.hasNext())
		{
			a[i] = (int)iterator.next(); 
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

		System.out.println("�Ӵ�С���У�");
		for(int temp : a)
			System.out.print(temp+" ");
		System.out.println();
		return a;
	}

	public static double average(int[] a)
	{
		int sum = 0;
		for(int temp : a)
			sum = sum + temp;
		return (double)sum/a.length;
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		hashset = random(n);
		Iterator iterator = hashset.iterator();
		System.out.println("�����е�Ԫ��Ϊ��");
		iterator.forEachRemaining(obj -> System.out.print(obj+" "));
		System.out.println();

		int[] a = sort(n);

		System.out.println("�����е�����ƽ��ֵΪ��"+average(a));
	}
}
