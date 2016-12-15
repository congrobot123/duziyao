import java.util.Scanner;
import java.io.File; 

public class TestDEL 
{
	public static void main(String[] args) 
	{
		File file = new File(".");
		Scanner sc = new Scanner(System.in);

		String str1 = sc.next();
		String filename = sc.next();
		String str2 = file.getAbsolutePath();
		str2 = str2.substring(0,str2.length()-1);
		String path = str2 + filename;

		File file1 = new File(path);

		if(str1.equals("del") || str1.equals("DEL"))
		{
			if(file1.exists())
			{
				file1.delete();
			}
			else
			{
				System.out.println("找不到 " + path);
			}
		}
		else
		{
			System.out.println("'" + str1 + "' 不是内部或外部命令，也不是可运行的程序\n" +
								"或批处理文件。");
		}
	}
}
