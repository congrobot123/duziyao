import java.util.Scanner;

public class Test5 
{
	static String[] str1 = {"��","Ҽ","��","��","��","��","½","��","��","��"};

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();

		System.out.println(transform(a)+"��");
	}

	public static String transform(int a)
	{
		if(a / 100000000 >= 1)
		{
			int b = a%10000;
			int c = (a-b)/10000%10000;
			int d = (a-b-c*10000)/100000000;
			return transform(d)+"��"+transform(c)+"��"+transform(b);
		}
		else if(a / 10000 >= 1)
		{
			int b = a%10000;
			int c = (a-b)/10000;
			return transform(c)+"��"+transform(b);
		}
		else
		{
			int b = a/1000;
			int c = a%1000/100;
			int d = a%100/10;
			int e = a%10;
			String str = new String();
			if(b == 0)
			{
				str = str+str1[b];
				if(c == 0)
				{
					if(d != 0)
					{
						str = str+str1[d]+"ʰ";
					}
				}
				else
				{
					str = str+str1[c]+"��";
					if(d == 0)
					{
						str = str+str1[c];
					}
					else
					{
						str = str+str1[d]+"ʰ";
					}
				}
			}
			else
			{
				str = str+str1[b]+"Ǫ";
				if(c == 0)
				{
					str = str+str1[c];
					if(d != 0)
					{
						str = str+str1[d]+"ʰ";
					}
				}
				else
				{
					str = str+str1[c]+"��";
					if(d == 0)
					{
						str = str+str1[c];
					}
					else
					{
						str = str+str1[d]+"ʰ";
					}
				}
			}
			if(e != 0)
				str = str+str1[e];
			return str;
		}
	}
}
