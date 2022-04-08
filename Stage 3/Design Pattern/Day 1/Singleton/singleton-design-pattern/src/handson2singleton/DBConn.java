package handson2singleton;

public class DBConn {

	private static DBConn instance =new DBConn();

	private DBConn() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public static DBConn getInstance() {
		return instance;
	}
}

