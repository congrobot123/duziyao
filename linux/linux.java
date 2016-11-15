import java.util.Scanner;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.time.LocalDateTime;

public class linux 
{
	public static void clear()
	{
		for(int i=0; i<15; i++)
			System.out.println("\n");
		System.out.print("[root@localhost ~]# ");
	}

	public static void help()
	{
		System.out.println("有关某个命令的详细信息，请键入 HELP 命令名");
		System.out.println("ASSOC          显示或修改文件扩展名关联。");
		System.out.println("ATTRIB         显示或更改文件属性。");
		System.out.println("BREAK          设置或清除扩展式 CTRL+C 检查。");
		System.out.println("BCDEDIT        设置启动数据库中的属性以控制启动加载。");
		System.out.println("CACLS          显示或修改文件的访问控制列表(ACL)。");
		System.out.println("CALL           从另一个批处理程序调用这一个。");
		System.out.println("CD             显示当前目录的名称或将其更改。");
		System.out.println("CHCP           显示或设置活动代码页数。");
		System.out.println("CHDIR          显示当前目录的名称或将其更改。");
		System.out.println("CHKDSK         检查磁盘并显示状态报告。");
		System.out.println("CHKNTFS        显示或修改启动时间磁盘检查。");
		System.out.println("CLS            清除屏幕。");
		System.out.println("CMD            打开另一个 Windows 命令解释程序窗口。");
		System.out.println("COLOR          设置默认控制台前景和背景颜色。");
		System.out.println("COMP           比较两个或两套文件的内容。");
		System.out.println("COMPACT        显示或更改 NTFS 分区上文件的压缩。");
		System.out.println("CONVERT        将 FAT 卷转换成 NTFS。你不能转换");
		System.out.println("               当前驱动器。");
		System.out.println("COPY           将至少一个文件复制到另一个位置。");
		System.out.println("DATE           显示或设置日期。");
		System.out.println("DEL            删除至少一个文件。");
		System.out.println("DIR            显示一个目录中的文件和子目录。");
		System.out.println("DISKPART       显示或配置磁盘分区属性。");
		System.out.println("DOSKEY         编辑命令行、撤回 Windows 命令并");
		System.out.println("               创建宏。");
		System.out.println("DRIVERQUERY    显示当前设备驱动程序状态和属性。");
		System.out.println("ECHO           显示消息，或将命令回显打开或关闭。");
		System.out.println("ENDLOCAL       结束批文件中环境更改的本地化。");
		System.out.println("ERASE          删除一个或多个文件。");
		System.out.println("EXIT           退出 CMD.EXE 程序(命令解释程序)。");
		System.out.println("FC             比较两个文件或两个文件集并显示");
		System.out.println("               它们之间的不同。");
		System.out.println("FIND           在一个或多个文件中搜索一个文本字符串。");
		System.out.println("FINDSTR        在多个文件中搜索字符串。");
		System.out.println("FOR            为一组文件中的每个文件运行一个指定的命令。");
		System.out.println("FORMAT         格式化磁盘，以便用于 Windows。");
		System.out.println("FSUTIL         显示或配置文件系统属性。");
		System.out.println("FTYPE          显示或修改在文件扩展名关联中使用的文件");
		System.out.println("               类型。");
		System.out.println("GOTO           将 Windows 命令解释程序定向到批处理程序");
		System.out.println("               中某个带标签的行。");
		System.out.println("GPRESULT       显示计算机或用户的组策略信息。");
		System.out.println("GRAFTABL       使 Windows 在图形模式下显示扩展");
		System.out.println("               字符集。");
		System.out.println("HELP           提供 Windows 命令的帮助信息。");
		System.out.println("ICACLS         显示、修改、备份或还原文件和");
		System.out.println("               目录的 ACL。");
		System.out.println("IF             在批处理程序中执行有条件的处理操作。");
		System.out.println("LABEL          创建、更改或删除磁盘的卷标。");
		System.out.println("MD             创建一个目录。");
		System.out.println("MKDIR          创建一个目录。");
		System.out.println("MKLINK         创建符号链接和硬链接");
		System.out.println("MODE           配置系统设备。");
		System.out.println("MORE           逐屏显示输出。");
		System.out.println("MOVE           将一个或多个文件从一个目录移动到另一个");
		System.out.println("               目录。");
		System.out.println("OPENFILES      显示远程用户为了文件共享而打开的文件。");
		System.out.println("PATH           为可执行文件显示或设置搜索路径。");
		System.out.println("PAUSE          暂停批处理文件的处理并显示消息。");
		System.out.println("POPD           还原通过 PUSHD 保存的当前目录的上一个");
		System.out.println("               值。");
		System.out.println("PRINT          打印一个文本文件。");
		System.out.println("PROMPT         更改 Windows 命令提示。");
		System.out.println("PUSHD          保存当前目录，然后对其进行更改。");
		System.out.println("RD             删除目录。");
		System.out.println("RECOVER        从损坏的或有缺陷的磁盘中恢复可读信息。");
		System.out.println("REM            记录批处理文件或 CONFIG.SYS 中的注释(批注)。");
		System.out.println("REN            重命名文件。");
		System.out.println("RENAME         重命名文件。");
		System.out.println("REPLACE        替换文件。");
		System.out.println("RMDIR          删除目录。");
		System.out.println("ROBOCOPY       复制文件和目录树的高级实用工具");
		System.out.println("SET            显示、设置或删除 Windows 环境变量。");
		System.out.println("SETLOCAL       开始本地化批处理文件中的环境更改。");
		System.out.println("SC             显示或配置服务(后台进程)。");
		System.out.println("SCHTASKS       安排在一台计算机上运行命令和程序。");
		System.out.println("SHIFT          调整批处理文件中可替换参数的位置。");
		System.out.println("SHUTDOWN       允许通过本地或远程方式正确关闭计算机。");
		System.out.println("SORT           对输入排序。");
		System.out.println("START          启动单独的窗口以运行指定的程序或命令。");
		System.out.println("SUBST          将路径与驱动器号关联。");
		System.out.println("SYSTEMINFO     显示计算机的特定属性和配置。");
		System.out.println("TASKLIST       显示包括服务在内的所有当前运行的任务。");
		System.out.println("TASKKILL       中止或停止正在运行的进程或应用程序。");
		System.out.println("TIME           显示或设置系统时间。");
		System.out.println("TITLE          设置 CMD.EXE 会话的窗口标题。");
		System.out.println("TREE           以图形方式显示驱动程序或路径的目录");
		System.out.println("               结构。");
		System.out.println("TYPE           显示文本文件的内容。");
		System.out.println("VER            显示 Windows 的版本。");
		System.out.println("VERIFY         告诉 Windows 是否进行验证，以确保文件");
		System.out.println("               正确写入磁盘。");
		System.out.println("VOL            显示磁盘卷标和序列号。");
		System.out.println("XCOPY          复制文件和目录树。");
		System.out.println("WMIC           在交互式命令 shell 中显示 WMI 信息。\n");
		System.out.println("有关工具的详细信息，请参阅联机帮助中的命令行参考。\n");
		System.out.print("[root@localhost ~]# ");
	}

	public static void date()
	{
		LocalDateTime date = LocalDateTime.now();
		DateTimeFormatter f = DateTimeFormatter.ofPattern("yyyy年MM月dd日  hh:MM:ss");
		System.out.println(f.format(date));
		System.out.print("[root@localhost ~]# ");
	}

	public static void cpuinfo()
	{

	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		sc.useDelimiter("\n");
		String str = null;
		System.out.print("[root@localhost ~]# ");
		while (sc.hasNext())
		{
			str = sc.next();
			str = str.substring(0, str.length()-1);
			System.out.print("[root@localhost ~]# ");
			if(str.length() != 0)
			{
				switch (str)
				{
				case "clear":
					clear();
					break;
				case "help":
					help();
					break;
				case "date":
					date();
					break;
				case "cpuinfo":
					cpuinfo();
					break;
				default:
					System.out.println("\n'"+str+"' 不是内部或外部命令，也不是可运行的程序\n"+
										"或批处理文件。");
				}
			}
		}
	}
}
