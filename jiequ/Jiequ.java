import java.util.Scanner;

public class Jiequ 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("input string:");
		String str1 = sc.next();
		String str3 = null;

		System.out.println("input substring:");
		while(sc.hasNext())
		{
			String str2 = sc.next();
			int n = str1.indexOf(str2);
			if(n == 0)
			{
				str3 = str1.substring(str2.length(),str1.length());
				str1 = str3;
			}
			else 
			{
				str3 = str1.substring(0,n);
				str3 = str3+str1.substring(n+str2.length(),str1.length());
				str1 = str3;
			}
			System.out.println(str3);
			System.out.println("input substring:");
		}
	}
}
