import java.rmi.NotBoundException;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import RMIInterface.Constant;
import RMIInterface.MainRemote;

import UserInterface.*;

public class RMIClient {
	
	public static void main(String[] args) throws RemoteException, NotBoundException {
		Registry reg = LocateRegistry.getRegistry("24.94.236.72", Constant.RMI_PORT);
		MainRemote remote = (MainRemote) reg.lookup(Constant.RMI_ID);
		
		HomePage index = new HomePage();
		
		index.setVisible(true);
	}
}
