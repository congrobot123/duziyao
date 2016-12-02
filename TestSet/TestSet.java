import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;
import java.util.Collection;

public class TestSet
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);	
		Set hashset = new HashSet();

		for(int i=0; i<20; i++)
			hashset.add(sc.next());

		System.out.println(hashset);
	}
}
