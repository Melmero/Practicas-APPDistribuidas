package Server;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class MainServer {
    public static void main(String[] args) throws Exception {
        try {
            Registry myRegistry = LocateRegistry.createRegistry(1234);
            myRegistry.rebind("Matematicas", new ServerImplements()); 
            System.out.println("Servidor ON");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
