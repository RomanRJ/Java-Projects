package Curso;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class c_insert_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int id=11,edad=15;
		String nom="Pedro";
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/prueba","root","");
			String inser="INSERT INTO test1 VALUES("+id+",'"+nom+"',"+edad+");";
			
			Statement stmt=con.createStatement();
			stmt.executeUpdate(inser);
			con.close();
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}