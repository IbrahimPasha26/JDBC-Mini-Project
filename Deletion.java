import java.sql.*;
import java.util.Scanner;
public class Deletion {
	public void deleting (Connection con, PreparedStatement pstmt, String query)
	{
		try 
		{
			query = "Delete from Student where id = ?";
			pstmt = con.prepareStatement(query);
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter ID whos record should be Deleted.");
			int id = scan.nextInt();
			pstmt.setInt(1, id);
			pstmt.executeUpdate();
			System.out.println("Record Deleted....!!!!!!");
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
}
