import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Read
{
	public static void main(String[] args) 
		throws FileNotFoundException
	{
		Scanner sc = new Scanner(new File("def.txt"));
		
		while(sc.hasNextLine())
		{
			int a = sc.nextInt();
			int b = sc.nextInt();
			System.out.println(a+"+"+b+"="+(a+b));
		}
	}
}
