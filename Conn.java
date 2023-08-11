import java.sql.*;

public class Conn 
{
	public Connection connection(String path,String url, String un,String pw,Connection con)
	{
		try 
		{
			Class.forName(path);
			System.out.println("Driver Loaded");
			con = DriverManager.getConnection(url,un,pw);
			System.out.println("Connection Established Successfully");
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		return con;
		
	}
}
