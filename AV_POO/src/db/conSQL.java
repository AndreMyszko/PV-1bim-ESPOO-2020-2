package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class conSQL {
    private String connectionUrl = "jdbc:sqlserver://winsrv-sql.winsrv.local:1433;databaseName=PV_1bim_ESPOO_2020_2;user=sa;password=****";
	
    public Connection conectar() throws SQLException {
    	try {
			return DriverManager.getConnection(connectionUrl);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw e;
		}
    }
}
