MyRemoteInterface.java
import java.rmi.*;

interface MyRemoteInterface extends Remote {
    String sendMessage(String msg) throws RemoteException;
}

ServerImple.java
import java.rmi.*;
import java.rmi.server.*;

class ServerImple extends UnicastRemoteObject
        implements MyRemoteInterface {

    ServerImple() throws RemoteException {}

    public String sendMessage(String msg) throws RemoteException {
        return "Received: " + msg;
    }
}

Server.java
import java.rmi.*;
import java.rmi.registry.*;

class Server {
    public static void main(String[] a) throws Exception {
        LocateRegistry.createRegistry(1099);
        Naming.rebind("MyRemoteObject", new ServerImple());
        System.out.println("Server running");
    }
}

Client.java
import java.rmi.*;

class Client {
    public static void main(String[] a) throws Exception {
        MyRemoteInterface r =
            (MyRemoteInterface) Naming.lookup(
                "rmi://localhost/MyRemoteObject");

        System.out.println(r.sendMessage("Hello from Client"));
    }
}