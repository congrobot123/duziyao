import java.util.Random;

public class CaiPiao 
{
	public static void main(String[] args) 
	{
		Random ra = new Random();
		int a =ra.nextInt(10000);
		if(a < 10)
			System.out.println("��ϲ����һ�Ƚ���");
		else if(a >= 10 && a < 100)
			System.out.println("��ϲ���ö��Ƚ���");
		else if(a >= 100 && a < 1000)
			System.out.println("��ϲ�������Ƚ���");
		else
			System.out.println("лл�ݹˣ�");
	}
}
