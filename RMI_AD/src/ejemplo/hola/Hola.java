package ejemplo.hola;
import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Hola extends Remote {
    String diHola() throws RemoteException;
}
