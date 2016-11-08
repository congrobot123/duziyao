public class help  
{
	public static void main(String[] args) 
	{
		if(args.length == 1 && args[0].equals("ASSOC"))
		{
			System.out.println("显示或修改文件扩展名关联\n");
			System.out.println("ASSOC [.ext[=[fileType]]]\n");
			System.out.println("  .ext      指定跟文件类型关联的文件扩展名");
			System.out.println("  fileType  指定跟文件扩展名关联的文件类型\n");
			System.out.println("键入 ASSOC 而不带参数，显示当前文件关联。如果只用文件扩展");
			System.out.println("名调用 ASSOC，则显示那个文件扩展名的当前文件关联。如果不为");
			System.out.println("文件类型指定任何参数，命令会删除文件扩展名的关联。");
			return;
		}
		else if(args.length == 1 && args[0].equals("ATTRIB"))
		{
			System.out.println("显示或更改文件属性。\n");
			System.out.println("ATTRIB [+R | -R] [+A | -A ] [+S | -S] [+H | -H] [+I | -I]");
			System.out.println("       [drive:][path][filename] [/S [/D] [/L]]\n");
			System.out.println("  +   设置属性。");
			System.out.println("  -   清除属性。");
			System.out.println("  R   只读文件属性。");
			System.out.println("  A   存档文件属性。");
			System.out.println("  S   系统文件属性。");
			System.out.println("  H   隐藏文件属性。");
			System.out.println("  I   无内容索引文件属性。");
			System.out.println("  X   无清理文件属性。");
			System.out.println("  V   完整性属性。");
			System.out.println("  [drive:][path][filename]");
			System.out.println("      指定 attrib 要处理的文件。");
			System.out.println("  /S  处理当前文件夹");
			System.out.println("      及其所有子文件夹中的匹配文件。");
			System.out.println("  /D  也处理文件夹。");
			System.out.println("  /L  处理符号链接和");
			System.out.println("      符号链接目标的属性");
			return;
		}
	}
}
