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
		Registry reg = LocateRegistry.getRegistry("localhost", Constant.RMI_PORT);
		MainRemote remote = (MainRemote) reg.lookup(Constant.RMI_ID);
		
		HomePage firstWindow = new HomePage();
		String[] login = firstWindow.askForLogIn();
		
		if(remote.isLoginValid(login[0], Integer.parseInt(login[1]))) {
			System.out.println("Hi there!");
		} else {
			System.out.println("Incorrect username and password. Disconnecting...");
		}
		
	}
}
