import java.util.Scanner;
import java.io.File;
import java.util.HashMap;
	
public class Test2 
{
	public static void main(String[] args) 
	{
		try
		(
			Scanner sc = new Scanner(new File("name.txt"));
		)

		{
			sc.useDelimiter(",");
			HashMap hashmap = new HashMap();
			String[] str = new String[100];
			int i = 0;

			while (sc.hasNext())
			{
				str[i] = sc.next();	
				if()
					hashmap.put(str, 1);
				++i;
			}
			
			System.out.println(str);
		}
		catch (Exception e)
		{
			System.out.println("error");
		}
		

		
	}
}
