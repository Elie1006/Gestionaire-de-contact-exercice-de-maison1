public class ContactsManager {
    Contact[] myFriends;
    int friendsCount;

    // Constructeur : initialise le gestionnaire
    ContactsManager() {
        friendsCount = 0;
        myFriends = new Contact[500];
    }

    // Méthode pour ajouter un contact
    void addContact(Contact contact) {
        myFriends[friendsCount] = contact;
        friendsCount++;
    }

    // Méthode pour chercher un contact par son nom
    Contact searchContact(String nomRecherche) {

        for (int i = 0; i < friendsCount; i++) {

            if (myFriends[i].nom.equals(nomRecherche)) {
                return myFriends[i];
            }
        }
        return null;
    }
}
