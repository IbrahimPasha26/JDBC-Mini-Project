import java.sql.*;
public class Drop 
{
	public void drop (Connection con, Statement stmt, String query)
	{
		try 
		{
			query ="Drop table Student";
			stmt = con.createStatement();
			stmt.executeQuery(query);
			System.out.println("Table Deleted.....!!!!!!!!!!!");
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
}
