
package sockettcp;

public class SocketTCP {

    public static void main(String[] args) {
        ClientTCP cliente = new ClientTCP();
        ServerTCP servidor = new ServerTCP();
        cliente.main(args);
        servidor.main(args);
    }
    
}
