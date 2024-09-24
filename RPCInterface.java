package ex6;
import java.rmi.Remote;
import java.rmi.RemoteException;
public class RPCInterface extends Remote {
	 public String sayHello(String name) throws RemoteException;
}
