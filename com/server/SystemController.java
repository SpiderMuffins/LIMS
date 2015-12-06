import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.sql.*;

import RMIInterface.MainRemote;

public class SystemController extends UnicastRemoteObject implements MainRemote {
	
	private static final long serialVersionUID = 1L;
	public static Connection mainConn;

	
	protected SystemController() throws RemoteException {
		super();
		
		try {
			mainConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/c9", "jayw685", "incorrectpa22");
		} catch(SQLException sqle) {
			sqle.getSQLState();
		}
	}
	
	public boolean isLoginValid(String username, int PIN) throws RemoteException {
		if (username.equals("test") && PIN == 8574) {
			return true;
		}
		return false;
	}
	
	public ResultSet prepareQuery(String query) throws RemoteException, SQLException {
		Statement stmt = mainConn.createStatement();
		ResultSet myRs = stmt.executeQuery(query);
		
		return myRs;
	}
	
	public void fetchURL() throws RemoteException {
		System.out.println("NYI");
	}
}