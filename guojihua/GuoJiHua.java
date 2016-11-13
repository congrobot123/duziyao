import java.util.Locale;   //Î´Íê³É£¡£¡
import java.util.ResourceBundle;
import java.text.MessageFormat;

public class GuoJiHua 
{
	public static void main(String[] args) 
	{		
		Locale nowLocale = null;
		if(args.length == 2)
		{
			String name = args[0];
			nowLocale = new Locale(args[1]);
		}
		ResourceBundle bundle = ResourceBundle.getBundle("mess",nowLocale);
		String msg = bundle.getString("msg");
		System.out.println(MessageFormat.format(msg , name));
	}
}
