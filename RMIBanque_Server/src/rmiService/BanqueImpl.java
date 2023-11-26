package rmiService;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import metier.Compte;

public class BanqueImpl extends UnicastRemoteObject implements IBanque {

    public BanqueImpl() throws RemoteException {
        // Constructeur par défaut nécessaire pour UnicastRemoteObject
    }

    @Override
    public String creerCompte(Compte c) throws RemoteException {
        // Implémentation de la méthode creerCompte
        // Vous pouvez ajouter votre logique de création de compte ici
        return "Compte créé avec succès";
    }

    @Override
    public String getInfoCompte(int code) throws RemoteException {
        // Implémentation de la méthode getInfoCompte
        // Vous pouvez ajouter votre logique pour obtenir les informations du compte ici
        return "Informations du compte avec le code " + code;
    }
}