import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Move
{
	public static void main(String[] args) 
		throws IOException
	{
		if(args.length == 2)
		{
			File file = new File(args[0]);
			String str = args[1] + "\\" + args[0];
			File path = new File(str);

			if(file.exists())
			{
				if(path.exists())
				{
					System.out.println("���� " + str + " ��? (Yes/No/All):");
				}
				else
				{
					path.createNewFile();
					FileInputStream read = new FileInputStream(file);
					FileOutputStream write = new FileOutputStream(file);
					byte[] b = new byte[1024];
					int hasRead = 0;

					while ((hasRead = read.read(b)) > 0)
					{
						write.write(b, 0, hasRead);
					}
					file.delete();
					read.close();
					write.close();
					System.out.println("���ƶ� 1 ���ļ���");
				}
			}
			else
			{
				System.out.println("ϵͳ�Ҳ���ָ�����ļ���");
			}
		}
	}
}