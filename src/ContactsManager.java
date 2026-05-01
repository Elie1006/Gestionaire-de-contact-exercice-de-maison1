public class ContactsManager {

    // Tableau pour stocker les contacts
    Contact[] myFriends;

    // Nombre de contacts actuellement enregistrés
    int friendsCount;

    // Constructeur : initialise le tableau et le compteur
    ContactsManager() {
        friendsCount = 0;
        myFriends = new Contact[500];
    }

    // Ajouter un contact dans le tableau
    void addContact(Contact contact) {
        if (friendsCount < myFriends.length) {
            myFriends[friendsCount] = contact;
            friendsCount++;
        } else {
            System.out.println("Liste de contacts pleine !");
        }
    }

    // Rechercher un contact par son nom
    Contact searchContact(String nomRecherche) {

        // Sécurité si la recherche est vide
        if (nomRecherche == null) {
            return null;
        }

        // Parcourir les contacts enregistrés
        for (int i = 0; i < friendsCount; i++) {

            // Vérifie que le contact existe et que le nom correspond
            if (myFriends[i] != null &&
                    myFriends[i].nom != null &&
                    myFriends[i].nom.trim().equalsIgnoreCase(nomRecherche.trim())) {

                // Si trouvé → retourner le contact
                return myFriends[i];
            }
        }

        // Si aucun contact trouvé → retourner null
        return null;
    }
}
