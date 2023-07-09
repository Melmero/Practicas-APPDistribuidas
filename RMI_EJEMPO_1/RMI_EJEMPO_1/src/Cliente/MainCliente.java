package Cliente;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import javax.swing.JOptionPane;
import RMI.RemoteInterface;

public class MainCliente {
    public static void main(String[] args) {
        try {
            String valorA = JOptionPane.showInputDialog("Ingrese el valor número uno");            
            String valorB = JOptionPane.showInputDialog("Ingrese el valor número dos"); 
            int a = Integer.parseInt(valorA);
            int b = Integer.parseInt(valorB);
            Registry miResgistro = LocateRegistry.getRegistry("192.168.56.1", 1234);
            RemoteInterface s = (RemoteInterface) miResgistro.lookup("Matematicas");
            JOptionPane.showMessageDialog(null, "Resultado Suma: " +s.suma(a, b));           
            JOptionPane.showMessageDialog(null, "Resultado Resta: " +s.resta(a, b));           
            JOptionPane.showMessageDialog(null, "Resultado Multiplicación: " +s.multiplica(a, b));           
            JOptionPane.showMessageDialog(null, "Resultado División: " +s.division(a, b));           
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
