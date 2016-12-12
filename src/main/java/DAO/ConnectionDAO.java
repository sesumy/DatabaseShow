package DAO;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.*;

public class ConnectionDAO {
	public static Connection getConnection() {
		Connection connectStatus = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connectStatus = (Connection) DriverManager.getConnection("jdbc:mysql://mysql-sesumyy.jelastic.servint.net/weblab2", "root", "BnTpvtKcKx");
			System.out.println("Baðlandý");
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}		
		return connectStatus;
	}
}
