package ex6;

public class interface Calculator extends Remote {
	 int add(int a, int b) throws RemoteException;
	 int subtract(int a, int b) throws RemoteException;
	 int multiply(int a, int b) throws RemoteException;
	 double divide(int a, int b) throws RemoteException;
}