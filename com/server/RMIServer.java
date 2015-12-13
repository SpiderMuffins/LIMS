import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import java.lang.InterruptedException;

import Entities.*;

import RMIInterface.Constant;

public class RMIServer {
	public static void main(String[] args) throws RemoteException, AlreadyBoundException, InterruptedException
	{ 
			SystemController sc = new SystemController();
			Registry reg = LocateRegistry.createRegistry(Constant.RMI_PORT);
			reg.bind(Constant.RMI_ID, sc);
			System.out.println("Server is started.");
			long duration = 0;
			int hours, seconds, minutes;
			while(true) {
				Thread.sleep(1000);
				duration++;
				
				System.out.println("Server still running...\n");
				System.out.println("Use ^C ([Ctrl] + C) to terminate.");
				
				hours = (int) duration/3600;
				seconds = (int) duration - hours*3600;
				minutes = seconds / 60;
				seconds = seconds - minutes*60;
				
				System.out.println("\nUptime: " + String.format("%02d:%02d:%02d", hours, minutes, seconds));
				
				Thread.sleep(5000);
				duration = duration + 5;
				
				final String cls = "\u001b[2J";
		        final String home = "\u001b[H";
		        System.out.print(cls + home);
		        System.out.flush();
			}
	}
}
