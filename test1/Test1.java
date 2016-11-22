public class Test1 
{
	public static void main(String[] args) 
	{
		int a = 4,flag = 0;
		
		for(int j=1; flag==4;++j)
		{
			for(int i=0; i<4; i++)
			{
				if(a%4 == 0)
				{
					a = a/4*5+1;
					flag++;
				}
				else 
				{
					flag = 0;
					break;
				}
			}			
		}
		System.out.println("原来至少有"+a+"个桃子");
	}
}
