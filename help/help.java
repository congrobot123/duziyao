public class help  
{
	public static void main(String[] args) 
	{
		if(args.length == 1 && args[0].equals("ASSOC"))
		{
			System.out.println("��ʾ���޸��ļ���չ������\n");
			System.out.println("ASSOC [.ext[=[fileType]]]\n");
			System.out.println("  .ext      ָ�����ļ����͹������ļ���չ��");
			System.out.println("  fileType  ָ�����ļ���չ���������ļ�����\n");
			System.out.println("���� ASSOC ��������������ʾ��ǰ�ļ����������ֻ���ļ���չ");
			System.out.println("������ ASSOC������ʾ�Ǹ��ļ���չ���ĵ�ǰ�ļ������������Ϊ");
			System.out.println("�ļ�����ָ���κβ����������ɾ���ļ���չ���Ĺ�����");
			return;
		}
		else if(args.length == 1 && args[0].equals("ATTRIB"))
		{
			System.out.println("��ʾ������ļ����ԡ�\n");
			System.out.println("ATTRIB [+R | -R] [+A | -A ] [+S | -S] [+H | -H] [+I | -I]");
			System.out.println("       [drive:][path][filename] [/S [/D] [/L]]\n");
			System.out.println("  +   �������ԡ�");
			System.out.println("  -   ������ԡ�");
			System.out.println("  R   ֻ���ļ����ԡ�");
			System.out.println("  A   �浵�ļ����ԡ�");
			System.out.println("  S   ϵͳ�ļ����ԡ�");
			System.out.println("  H   �����ļ����ԡ�");
			System.out.println("  I   �����������ļ����ԡ�");
			System.out.println("  X   �������ļ����ԡ�");
			System.out.println("  V   ���������ԡ�");
			System.out.println("  [drive:][path][filename]");
			System.out.println("      ָ�� attrib Ҫ������ļ���");
			System.out.println("  /S  ����ǰ�ļ���");
			System.out.println("      �����������ļ����е�ƥ���ļ���");
			System.out.println("  /D  Ҳ�����ļ��С�");
			System.out.println("  /L  ����������Ӻ�");
			System.out.println("      ��������Ŀ�������");
			return;
		}
	}
}
