package ex6;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
public class Server extends UnicastRemoteObject implements Calculator {
	private static final long serialVersionUID = 1L;
    protected Server() throws RemoteException {
        super();
    }
    public int add(int a, int b) throws RemoteException {
        return a + b;
    }
    public int subtract(int a, int b) throws RemoteException {
        return a - b;
    }
    public int multiply(int a, int b) throws RemoteException {
        return a * b;
    }
    public double divide(int a, int b) throws RemoteException {
        if (b == 0) {
            throw new ArithmeticException("Division by zero is not allowed");
        }
        return (double) a / b;
    }
    public static void main(String[] args) {
        try {
            Server server = new Server();
            Registry registry = LocateRegistry.createRegistry(200);
            registry.bind("CalculatorService", server);
            System.out.println("Server is ready on port 2000...");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
