import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.sql.*;

import RMIInterface.MainRemote;

import Entities;
import Entities.IOFiles;

public class SystemController extends UnicastRemoteObject implements MainRemote {
	
	private static final long serialVersionUID = 1L;
	public static Connection mainConn;
	
	UserDB users = new UserDB();
	BookDB bks = new BookDB(); 
	TransactionDB trans = new TransactionDB();
	
	public void addCustomer (Customer c)
	{
		users.addCustomer(c);
		users.writeUDB();
	}
	
	public void deleteCustomer (String acc)
	{
		users.deleteCustomer(acc);
		users.writeUDB(); 
	}
	
	public void addBook (Book b)
	{
		bks.addBook(b);
		bks.writeBDB();
	}
	
	public void deleteBook (String isbn)
	{
		users.deleteBook(isbn);
		users.writeBDB(); 
	}
	
	public void addTrans (Transaction t)
	{
		trans.addBook(b);
		trans.writeTDB();
	}
	
	public void closeTransaction (String isbn)
	{
		trans.closeTransaction(isbn);
		trans.writeTDB(); 
	}
	
	protected SystemController() throws RemoteException {
		super();
		
		try {
			mainConn = DriverManager.getConnection("jdbc:mysql://24.94.228.232:3306/lims",
													"jpw0032", "just4Jp!");
		} catch(SQLException sqle) {
			sqle.getSQLState();
		}
	}
	
	public boolean isLoginValid(String username, String PIN) throws RemoteException {
		Customer c = users.getCustomer(username);
		if (c.getPin().equals(PIN))
			return true; 
		return false;
	}
	
	public ResultSet prepareQuery(String query) throws RemoteException, SQLException {
		Statement stmt = mainConn.createStatement();
		ResultSet myRs = stmt.executeQuery(query);
		
		return myRs;
	}
	
	
}
