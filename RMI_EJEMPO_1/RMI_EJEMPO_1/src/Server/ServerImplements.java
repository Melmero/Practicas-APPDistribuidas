package Server;
import RMI.RemoteInterface;

import java.rmi.server.UnicastRemoteObject;

public class ServerImplements extends UnicastRemoteObject implements RemoteInterface  {
    public ServerImplements() throws Exception{
        super();
    }

    @Override
    public int suma(int x, int y) throws Exception {
       return (x + y);
    }

    public int resta(int x, int y) throws Exception {
        return (x - y);
    }

    public int multiplica(int x, int y) throws Exception {
        return (x * y);
    }

    public int division(int x, int y) throws Exception {
        return (x / y);
    }
}
