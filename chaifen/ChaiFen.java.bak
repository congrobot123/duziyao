import java.util.Scanner;

public class ChaiFen 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		char[] ch = str.toCharArray();
		char[] a = new char[10];
		int x = 0;
		char[] s = new char[10];
		int y = 0;
		for(int i = 0; i<ch.length; i++)
		{
			if(ch[i] >= 'a' && ch[i] <= 'z')
			{
				a[x] = ch[i];
				x++;
			}
			else if(ch[i] >= '0' && ch[i] <= '9')
			{
				s[y] = ch[i];
				y++;
			}
		}

		for(char temp : a)
			System.out.print(temp+" ");
		System.out.println();
		for(char temp : s)
			System.out.print(temp+" ");
		System.out.println();
	}
}
