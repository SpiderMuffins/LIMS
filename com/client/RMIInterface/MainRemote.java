package RMIInterface;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface MainRemote extends Remote {
	public boolean isLoginValid(String username, int PIN) throws RemoteException;
	public boolean prepareQuery(String query) throws RemoteException;
}