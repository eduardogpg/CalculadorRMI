import java.rmi.*;

public interface Calculadora extends Remote{
	public int suma(int a, int b) throws RemoteException;
	public int resta(int a, int b) throws RemoteException;
	public int multiplicar(int a, int b) throws RemoteException;
	public int dividir(int a, int b) throws RemoteException;
  }