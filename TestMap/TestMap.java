import java.util.HashMap;
import java.util.Map;

public class TestMap 
{
	public static void main(String[] args) 
	{
		String[] str = new String[]{"a","b","a","b","c","a","b","c","b"};
		Map map = new HashMap();
		
		for(int i=0; i<str.length; i++)
		{
			if(map.containsKey(str[i]))
			{
				int j = (int)map.get(str[i]);

				map.put(str[i], ++j);
			}
			else
				map.put(str[i], 1);
		}

		System.out.println(map);
	}
}
