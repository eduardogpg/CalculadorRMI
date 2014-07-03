import java.rmi.*;
import java.rmi.server.*;

public class CalculadoraServicio extends UnicastRemoteObject implements Calculadora{
    
    public CalculadoraServicio() throws RemoteException{
        super();

    }
    
    
    public int suma(int a, int b) throws RemoteException {
        System.out.println("Una Suma es solicitada");
        return a + b;
    }

    public int resta(int a, int b) throws RemoteException {
        System.out.println("Una Resta es Solicitada");
        return a - b;
    }

    public int multiplicar(int a, int b) throws RemoteException {
        System.out.println("Una Multiplicacion es solicitada");
        return a * b;
    }

    public int dividir(int a, int b) throws RemoteException {
        System.out.println("Una Division es solicitada");
        if ( (a == 0) || (b == 0))
            return 0;
        else
            return a/b;
    }
    
}
