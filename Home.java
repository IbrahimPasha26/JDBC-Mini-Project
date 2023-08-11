import java.util.Scanner;
import java.sql.*;
public class Home
{
public static void main(String[] args) 
{
	String path = "oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	String un = "System";
	String pw = "system";
	Connection con = null;
	Statement stmt = null;
	PreparedStatement pstmt = null;
	String query = null;
	ResultSet res = null;
	
	//Connecting to database
	Conn conn = new Conn();
	Connection con1 = conn.connection(path, url, un, pw, con);
	//Table Creating Object
	Table_Creation table = new Table_Creation();
	//Data Insertion Object
	Insertion insert = new Insertion();
	//Updation Object
	Updation update = new Updation();
	//Deletion Object
	Deletion delete = new Deletion();
	//Display Object
	Display dis = new Display();
	//Drop Object
	Drop drop = new Drop();
	while(true)
	{
		System.out.println("--------------------------------------------------------------------------------");
		System.out.println("Welcome !!!!!!!");
		System.out.println("Press 1 -> Tabel Creation.");
		System.out.println("Press 2 -> Insert of Data into Table.");
		System.out.println("Press 3 -> Updating the data in the Table.");
		System.out.println("Press 4 -> Deletion of data in the Table.");
		System.out.println("Press 5 -> Display Data Contents.");
		System.out.println("Press 6-> Drop the Table");
		System.out.println("Press any Number  Exit...!!!!");
		System.out.println("Enter your Choice..");
		System.out.println("--------------------------------------------------------------------------------");
		Scanner scan = new Scanner(System.in);
		int ch = scan.nextInt();
		switch(ch)
		{
		case 1 : table.tableCreation(query, pstmt, con1);
		break;
		case 2 : System.out.println("Insertion of Data into Table."); 
			insert.insertion(con1, pstmt, query);
		break;
		case 3 : update.updating(con1, pstmt, query);
		break;
		case 4 : delete.deleting(con1, pstmt, query);
		break;
		case 5 : dis.Disp(res, con1, pstmt, query);
		break;
		case 6 : drop.drop(con1, pstmt, query);
		break;
		default : System.out.println("Thanks...... Bye bye............");
		return;
		}
	}
}
}
