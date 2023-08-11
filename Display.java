import java.sql.*;
public class Display {
	public void Disp(ResultSet res, Connection con, Statement stmt, String query)
	{
		try 
		{
			query = "Select * from Student	";
			stmt = con.createStatement();
			res = stmt.executeQuery(query);
			while(res.next()==true)
			{
				int id = res.getInt("Id");
				String name = res.getString("Name");
				String course = res.getString("Course");
				int m1 = res.getInt("Marks1");
				int m2 = res.getInt("Marks2");
				int m3 = res.getInt("Marks3");
				int m4 = res.getInt("Marks4");
				int m5 = res.getInt("Marks5");
				int total = res.getInt("Total");
				float avg = res.getInt("Average");
				System.out.println(id+" "+name+" "+course+" "+m1+" "+m2+" "+m3+" "+m4+" "+m5+" "+total+" "+avg);
			}
			System.out.println("Here Your Data........");
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
}
