import java.util.Scanner;

public class JiSuan 
{
	public static double pingjun(int[] a)
	{
		double sum = 0;
		for(int i = 0; i<10; i++)
		{
			sum = sum + a[i];
		}
		return sum/10.0;
	}

	public static int max(int[] a)
	{
		int max = a[0];
		for(int i = 1; i<10; i++)
		{
			if(max < a[i])
				max = a[i];
		}
		return max;
	}

	public static int min(int[] a)
	{
		int min = a[0];
		for(int i = 1; i<10; i++)
		{
			if(min > a[i])
				min = a[i];
		}
		return min;
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("please input 10 numbers:");
		int[] a = new int[10];
		for(int i = 0; i<10; i++)
		{
			a[i] = sc.nextInt();
		}
		System.out.println("ƽ��ֵΪ��"+JiSuan.pingjun(a));
		System.out.println("���ֵΪ��"+JiSuan.max(a));
		System.out.println("��СֵΪ��"+JiSuan.min(a));
	}
}
