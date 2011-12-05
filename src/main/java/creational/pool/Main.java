package creational.pool;

import java.sql.Connection;

/**
 * Based on: "Patterns in Java", Mark Grand.
 * 
 * Date: Aug 2, 2011
 * 
 * @author moleksyuk
 */
public class Main {

	public static void main(String[] args) {
		JDBCConnectionPool pool = new JDBCConnectionPool(
				"org.hsqldb.jdbcDriver", "jdbc:hsqldb://localhost/mydb",
				"user", "password");

		Connection connection = pool.getObject();
		System.out.println("Got object from pool: " + connection.getClass());

		// Use the connection
		// ...

		// Return the connection
		pool.release(connection);
		System.out.println("Released object.");
	}

}
