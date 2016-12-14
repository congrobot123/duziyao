import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.Random;

public class TestInsert 
{
	public static void main(String[] args) 
			throws Exception
	{
		Class.forName("com.mysql.jdbc.Driver");
		try
		(
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "congrobot");
			Statement stmt = conn.createStatement();
		)
		{
			for(int i=0; i<100; ++i)
			{
				Random ra = new Random();
				int a = ra.nextInt();
				String str = "insert into student_table value ('Test', null, '" + a + "', 'male', null);";
				int b = stmt.executeUpdate(str);
			}

			stmt.executeQuery("select * from student_table");

			try
			(
				ResultSet rs = stmt.getResultSet()
			)

			{
				ResultSetMetaData rsmd = rs.getMetaData();
				int columnCount = rsmd.getColumnCount();
				while(rs.next())
				{
					for(int i=0; i<columnCount; ++i)
					{
						System.out.print(rs.getString(i+1) + "    \t");
					}
					System.out.println();
				}
			}
		}	
	}
}
