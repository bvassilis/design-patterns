package creational.pool;

import java.sql.Connection;

/**
 * Based on: "Patterns in Java", Mark Grand.
 * 
 * Date: Aug 2, 2011
 * 
 * @author moleksyuk
 */
public class JDBCConnectionPool extends ObjectPool<Connection> {

	private String dsn;
	private String user;
	private String password;

	public JDBCConnectionPool(String driver, String dsn, String user,
			String password) {
		super();
		try {
			// Class.forName(driver).newInstance();
		} catch (Exception e) {
			e.printStackTrace();
		}
		this.dsn = dsn;
		this.user = user;
		this.password = password;
	}

	public JDBCConnectionPool(String driver, String dsn, String user,
			String password, int poolSize) {
		super(poolSize);

	}

	@SuppressWarnings("finally")
	@Override
	public Connection createObject() {
		Connection connection = null;
		try {
			// connection = DriverManager.getConnection(dsn, user, password);
			connection = new FakeConnection(dsn, user, password);
			instanceCount++;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			return connection;
		}
	}

}
