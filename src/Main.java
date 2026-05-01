import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // création du gestionnaire de contact
        ContactsManager monGestionnaire = new ContactsManager();

        // creation des contacts
        Contact contact1 = new Contact();
        contact1.nom = "Yapo Jean Elie";
        contact1.numeroTelephone = "07.07.94.15.95";
        monGestionnaire.addContact(contact1);

        Contact contact2 = new Contact();
        contact2.nom = "Yankey Ange";
        contact2.numeroTelephone = "01.51.90.38.92";
        monGestionnaire.addContact(contact2);

        Contact contact3 = new Contact();
        contact3.nom = "Zouzou Ange Patrick";
        contact3.numeroTelephone = "05.86.17.26.77";
        monGestionnaire.addContact(contact3);

        Contact contact4 = new Contact();
        contact4.nom = "Ouattara Fanta";
        contact4.numeroTelephone = "05.85.56.44.89";
        monGestionnaire.addContact(contact4);

        Contact contact5 = new Contact();
        contact5.nom = "Bamba Ousmane";
        contact5.numeroTelephone = "01.52.86.18.98";
        monGestionnaire.addContact(contact5);

        // 🔹 PARTIE MODIFIÉE (IMPORTANT)
        Scanner sc = new Scanner(System.in);

        System.out.print("Entrez le nom à rechercher : ");
        String nomRecherche = sc.nextLine();

        Contact contactTrouve = monGestionnaire.searchContact(nomRecherche);

        // affichage du résultat
        if (contactTrouve != null) {
            System.out.println("Contact trouvé : " + contactTrouve.nom);
            System.out.println("Son numéro est : " + contactTrouve.numeroTelephone);
        } else {
            System.out.println("contact introuvable");
        }
    }
}
