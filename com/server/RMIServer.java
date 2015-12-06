import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import java.lang.InterruptedException;

import RMIInterface.Constant;

public class RMIServer {
	public static void main(String[] args) throws RemoteException, AlreadyBoundException, InterruptedException
	{ 
			int i = 0;
			SystemController sc = new SystemController();
			Registry reg = LocateRegistry.createRegistry(Constant.RMI_PORT);
			reg.bind(Constant.RMI_ID, sc);
			System.out.println("Server is started.");
			while(true) {
				i++;
				Thread.sleep(1000);
				System.out.println("Server still running...\n");
				System.out.println("Use ^C ([Ctrl] + C) to terminate.");
				System.out.println("\nUptime: " + (1000*i));
			}
	}
}