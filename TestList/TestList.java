import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class TestList
{
	public static void main(String[] args) 
	{
		List list = new ArrayList();
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<10; i++)
			list.add(sc.next());

		System.out.println(list);
		System.out.println(list.get(5));

		System.out.println(list.indexOf(sc.next()));
		System.out.println(list.indexOf(sc.next()));

		list.remove(3);
		System.out.println(list);
	}
}
