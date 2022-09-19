package br.ucsal._20202.testequalidade.aula03.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbUtil {

	private static final String URL = "jdbc:postgresql://localhost:5432/aula03";
	private static final String USER = "postgres";
	private static final String PASSWORD = "abcd1234";

	private static Connection connection;

	private DbUtil() {
	}
	
	public static Connection getConnection() throws SQLException {
		if (connection == null) {
			connection = DriverManager.getConnection(URL, USER, PASSWORD);
		}
		return connection;
	}

	public static Boolean isConnectionValid() {
		try {
			getConnection();
			return true;
		} catch (SQLException e) {
			return false;
		}
	}

}
