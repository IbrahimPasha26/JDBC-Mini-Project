import java.sql.*;
import java.util.Scanner;

import javax.security.sasl.SaslClient;
public class Updation {
	public void updating(Connection con, PreparedStatement pstmt, String query)
	{
		try 
		{
			query = "Update Student set Name = ? where Id = ?";
			pstmt = con.prepareStatement(query);
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter Name for Updating");
			String name = scan.nextLine();
			System.out.println("Enter Id on wich name should updated");
			int id = scan.nextInt();
			pstmt.setString(1, name);
			pstmt.setInt(2, id);
			pstmt.executeUpdate();
			System.out.println("Data Updated Successfully");
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
}
