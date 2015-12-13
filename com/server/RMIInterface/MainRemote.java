package RMIInterface;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.sql.ResultSet;
import java.sql.SQLException;

public interface MainRemote extends Remote {
	public boolean isLoginValid(String username, int PIN) throws RemoteException;
	public ResultSet prepareQuery(String query) throws RemoteException, SQLException;
}