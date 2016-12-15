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
				System.out.println("子目录或文件" + dirname + "已经存在。");
			}
			else
			{
				dir.mkdir();
			}
		}
		else
		{
			System.out.println("'" + str1 + "' 不是内部或外部命令，也不是可运行的程序\n" + 
								"或批处理文件。");
		}
	}
}
