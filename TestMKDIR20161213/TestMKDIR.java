import java.util.Scanner;
import java.io.File;

public class TestMKDIR 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		File file = new File(".");

		String str1 = sc.next();
		String dirname = sc.next();
		String str2 = file.getAbsolutePath();
		str2 = str2.substring(0,str2.length()-1);
		String path = str2 + dirname;

		File dir = new File(path);

		if(str1.equals("mkdir") || str1.equals("MKDIR"))
		{
			if(dir.exists())
			{
				System.out.println("��Ŀ¼���ļ�" + dirname + "�Ѿ����ڡ�");
			}
			else
			{
				dir.mkdir();
			}
		}
		else
		{
			System.out.println("'" + str1 + "' �����ڲ����ⲿ���Ҳ���ǿ����еĳ���\n" + 
								"���������ļ���");
		}
	}
}
