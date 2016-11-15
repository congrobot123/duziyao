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
		System.out.println("�й�ĳ���������ϸ��Ϣ������� HELP ������");
		System.out.println("ASSOC          ��ʾ���޸��ļ���չ��������");
		System.out.println("ATTRIB         ��ʾ������ļ����ԡ�");
		System.out.println("BREAK          ���û������չʽ CTRL+C ��顣");
		System.out.println("BCDEDIT        �����������ݿ��е������Կ����������ء�");
		System.out.println("CACLS          ��ʾ���޸��ļ��ķ��ʿ����б�(ACL)��");
		System.out.println("CALL           ����һ����������������һ����");
		System.out.println("CD             ��ʾ��ǰĿ¼�����ƻ�����ġ�");
		System.out.println("CHCP           ��ʾ�����û����ҳ����");
		System.out.println("CHDIR          ��ʾ��ǰĿ¼�����ƻ�����ġ�");
		System.out.println("CHKDSK         �����̲���ʾ״̬���档");
		System.out.println("CHKNTFS        ��ʾ���޸�����ʱ����̼�顣");
		System.out.println("CLS            �����Ļ��");
		System.out.println("CMD            ����һ�� Windows ������ͳ��򴰿ڡ�");
		System.out.println("COLOR          ����Ĭ�Ͽ���̨ǰ���ͱ�����ɫ��");
		System.out.println("COMP           �Ƚ������������ļ������ݡ�");
		System.out.println("COMPACT        ��ʾ����� NTFS �������ļ���ѹ����");
		System.out.println("CONVERT        �� FAT ��ת���� NTFS���㲻��ת��");
		System.out.println("               ��ǰ��������");
		System.out.println("COPY           ������һ���ļ����Ƶ���һ��λ�á�");
		System.out.println("DATE           ��ʾ���������ڡ�");
		System.out.println("DEL            ɾ������һ���ļ���");
		System.out.println("DIR            ��ʾһ��Ŀ¼�е��ļ�����Ŀ¼��");
		System.out.println("DISKPART       ��ʾ�����ô��̷������ԡ�");
		System.out.println("DOSKEY         �༭�����С����� Windows ���");
		System.out.println("               �����ꡣ");
		System.out.println("DRIVERQUERY    ��ʾ��ǰ�豸��������״̬�����ԡ�");
		System.out.println("ECHO           ��ʾ��Ϣ����������Դ򿪻�رա�");
		System.out.println("ENDLOCAL       �������ļ��л������ĵı��ػ���");
		System.out.println("ERASE          ɾ��һ�������ļ���");
		System.out.println("EXIT           �˳� CMD.EXE ����(������ͳ���)��");
		System.out.println("FC             �Ƚ������ļ��������ļ�������ʾ");
		System.out.println("               ����֮��Ĳ�ͬ��");
		System.out.println("FIND           ��һ�������ļ�������һ���ı��ַ�����");
		System.out.println("FINDSTR        �ڶ���ļ��������ַ�����");
		System.out.println("FOR            Ϊһ���ļ��е�ÿ���ļ�����һ��ָ�������");
		System.out.println("FORMAT         ��ʽ�����̣��Ա����� Windows��");
		System.out.println("FSUTIL         ��ʾ�������ļ�ϵͳ���ԡ�");
		System.out.println("FTYPE          ��ʾ���޸����ļ���չ��������ʹ�õ��ļ�");
		System.out.println("               ���͡�");
		System.out.println("GOTO           �� Windows ������ͳ��������������");
		System.out.println("               ��ĳ������ǩ���С�");
		System.out.println("GPRESULT       ��ʾ��������û����������Ϣ��");
		System.out.println("GRAFTABL       ʹ Windows ��ͼ��ģʽ����ʾ��չ");
		System.out.println("               �ַ�����");
		System.out.println("HELP           �ṩ Windows ����İ�����Ϣ��");
		System.out.println("ICACLS         ��ʾ���޸ġ����ݻ�ԭ�ļ���");
		System.out.println("               Ŀ¼�� ACL��");
		System.out.println("IF             �������������ִ���������Ĵ��������");
		System.out.println("LABEL          ���������Ļ�ɾ�����̵ľ�ꡣ");
		System.out.println("MD             ����һ��Ŀ¼��");
		System.out.println("MKDIR          ����һ��Ŀ¼��");
		System.out.println("MKLINK         �����������Ӻ�Ӳ����");
		System.out.println("MODE           ����ϵͳ�豸��");
		System.out.println("MORE           ������ʾ�����");
		System.out.println("MOVE           ��һ�������ļ���һ��Ŀ¼�ƶ�����һ��");
		System.out.println("               Ŀ¼��");
		System.out.println("OPENFILES      ��ʾԶ���û�Ϊ���ļ�������򿪵��ļ���");
		System.out.println("PATH           Ϊ��ִ���ļ���ʾ����������·����");
		System.out.println("PAUSE          ��ͣ�������ļ��Ĵ�����ʾ��Ϣ��");
		System.out.println("POPD           ��ԭͨ�� PUSHD ����ĵ�ǰĿ¼����һ��");
		System.out.println("               ֵ��");
		System.out.println("PRINT          ��ӡһ���ı��ļ���");
		System.out.println("PROMPT         ���� Windows ������ʾ��");
		System.out.println("PUSHD          ���浱ǰĿ¼��Ȼ�������и��ġ�");
		System.out.println("RD             ɾ��Ŀ¼��");
		System.out.println("RECOVER        ���𻵵Ļ���ȱ�ݵĴ����лָ��ɶ���Ϣ��");
		System.out.println("REM            ��¼�������ļ��� CONFIG.SYS �е�ע��(��ע)��");
		System.out.println("REN            �������ļ���");
		System.out.println("RENAME         �������ļ���");
		System.out.println("REPLACE        �滻�ļ���");
		System.out.println("RMDIR          ɾ��Ŀ¼��");
		System.out.println("ROBOCOPY       �����ļ���Ŀ¼���ĸ߼�ʵ�ù���");
		System.out.println("SET            ��ʾ�����û�ɾ�� Windows ����������");
		System.out.println("SETLOCAL       ��ʼ���ػ��������ļ��еĻ������ġ�");
		System.out.println("SC             ��ʾ�����÷���(��̨����)��");
		System.out.println("SCHTASKS       ������һ̨���������������ͳ���");
		System.out.println("SHIFT          �����������ļ��п��滻������λ�á�");
		System.out.println("SHUTDOWN       ����ͨ�����ػ�Զ�̷�ʽ��ȷ�رռ������");
		System.out.println("SORT           ����������");
		System.out.println("START          ���������Ĵ���������ָ���ĳ�������");
		System.out.println("SUBST          ��·�����������Ź�����");
		System.out.println("SYSTEMINFO     ��ʾ��������ض����Ժ����á�");
		System.out.println("TASKLIST       ��ʾ�����������ڵ����е�ǰ���е�����");
		System.out.println("TASKKILL       ��ֹ��ֹͣ�������еĽ��̻�Ӧ�ó���");
		System.out.println("TIME           ��ʾ������ϵͳʱ�䡣");
		System.out.println("TITLE          ���� CMD.EXE �Ự�Ĵ��ڱ��⡣");
		System.out.println("TREE           ��ͼ�η�ʽ��ʾ���������·����Ŀ¼");
		System.out.println("               �ṹ��");
		System.out.println("TYPE           ��ʾ�ı��ļ������ݡ�");
		System.out.println("VER            ��ʾ Windows �İ汾��");
		System.out.println("VERIFY         ���� Windows �Ƿ������֤����ȷ���ļ�");
		System.out.println("               ��ȷд����̡�");
		System.out.println("VOL            ��ʾ���̾������кš�");
		System.out.println("XCOPY          �����ļ���Ŀ¼����");
		System.out.println("WMIC           �ڽ���ʽ���� shell ����ʾ WMI ��Ϣ��\n");
		System.out.println("�йع��ߵ���ϸ��Ϣ����������������е������вο���\n");
		System.out.print("[root@localhost ~]# ");
	}

	public static void date()
	{
		LocalDateTime date = LocalDateTime.now();
		DateTimeFormatter f = DateTimeFormatter.ofPattern("yyyy��MM��dd��  hh:MM:ss");
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
					System.out.println("\n'"+str+"' �����ڲ����ⲿ���Ҳ���ǿ����еĳ���\n"+
										"���������ļ���");
				}
			}
		}
	}
}
