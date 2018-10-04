package dbex;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DbTest {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "agnel");
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("select * from test.emp");
		while(rs.next()) {
			System.out.println("Id:"+rs.getInt(1)+"First Name:"+rs.getString(2)+"Last Name:"+rs.getString(3));
		}
		con.close();

	}

}
