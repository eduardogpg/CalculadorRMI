import java.rmi.*;
import java.rmi.registry.LocateRegistry;
/**
 *
 * @author eduardo
 */
public class CalculadoraServer {

    
    public static void main(String[] args)  throws Exception {
        
        System.out.println("Preparando el servicio . . . ");
        LocateRegistry.createRegistry(1099);
       	Calculadora calculadora = new CalculadoraServicio();

        String miUrl = "rmi://localhost:1099/Calculadora";

        Naming.rebind(miUrl, calculadora);
        
    }
    
}