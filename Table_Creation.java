import java.sql.*;
public class Table_Creation {
public void tableCreation(String query,Statement stmt,Connection con)
{
	 query = "Create table Student (ID number, Name varchar2(20), Course varchar2(20), Marks1 number, Marks2 number, Marks3 number, Marks4 number, Marks5 number, Total number, Average float)";
	 try 
	 {
		stmt = con.createStatement();
		stmt.executeUpdate(query);
		System.out.println("Congratulations Table Created...");
	}
	 catch (Exception e) 
	 {
		e.printStackTrace();
	}
}
}
