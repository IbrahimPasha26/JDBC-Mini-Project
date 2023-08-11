import java.sql.*;
import java.util.Scanner;
public class Insertion 
{
	public void insertion(Connection con, PreparedStatement pstmt, String query)
	{
		query = "Insert into Student values(?,?,?,?,?,?,?,?,?,?)";
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Id");
		int id = scan.nextInt();
		scan.nextLine();
		System.out.println("Enter Name");
		String name = scan.nextLine();
		System.out.println("Enter Course");
		String corse = scan.next();
		System.out.println("Enter Marks 1");
		int m1 = scan.nextInt();
		System.out.println("Enter Marks 2");
		int m2 = scan.nextInt();
		System.out.println("Enter Marks 3");
		int m3 = scan.nextInt();
		System.out.println("Enter Marks 4");
		int m4 = scan.nextInt();
		System.out.println("Enter Marks 5");
		int m5 = scan.nextInt();
		int total = m1+m2+m3+m4+m5;
		System.out.println("Total Marks = "+total);
		float avg = (m1+m2+m3+m4+m5)/5;
		System.out.println("Average of Marks ="+avg);
		try 
		{
			pstmt = con.prepareStatement(query);
			pstmt.setInt(1, id);
			pstmt.setString(2, name);
			pstmt.setString(3, corse);
			pstmt.setInt(4, m1);
			pstmt.setInt(5, m2);
			pstmt.setInt(6, m3);
			pstmt.setInt(7, m4);
			pstmt.setInt(8, m5);
			pstmt.setInt(9, total);
			pstmt.setFloat(10, avg);
			pstmt.executeUpdate();
			System.out.println("Data Inserted Successfully");
		}
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
		
	}
}
