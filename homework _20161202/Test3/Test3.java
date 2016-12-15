public class Test3 
{
	public static void main(String[] args) 
	{
		int[] people = new int[8];
		people[0] = 10;
		for (int i=1; i<8; i++)
		{
			people[i] = people[i-1]+2;
		}
		System.out.println("第八个人的年龄为："+people[7]);
	}
}
