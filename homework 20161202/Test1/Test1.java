public class Test1 
{
	public static void main(String[] args) 
	{
		String str = "a,b,c,d,e,f,g,h,i";
		System.out.println(str);
		System.out.println();
		
		char[] ch1 = new char[(str.length()+1)/2];
		char[] ch2 = str.toCharArray();
		int n = 0;
		for(int i=0; i<str.length(); i++)
		{
			if(ch2[i] != ',')
			{
				ch1[n]=ch2[i];
				n++;
			}
		}
		for(char temp : ch1)
			System.out.print(temp+" ");

	}
}
