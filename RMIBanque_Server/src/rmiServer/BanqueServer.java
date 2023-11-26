package rmiServer;

import rmiService.BanqueImpl;
import rmiService.IBanque;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class BanqueServer {

    public static void main(String[] args) {
        try {
            // Création de l'objet distant
            IBanque banque = new BanqueImpl();

            // Exportation de l'objet distant
            IBanque stub = (IBanque) UnicastRemoteObject.exportObject(banque, 0);

            // Création du registre RMI
            Registry registry = LocateRegistry.createRegistry(1099);

            // Enregistrement de l'objet distant dans le registre
            registry.rebind("BanqueService", stub);

            System.out.println("Serveur RMI prêt...");

        } catch (Exception e) {
            System.err.println("Erreur du serveur RMI : " + e.toString());
            e.printStackTrace();
        }
    }
}