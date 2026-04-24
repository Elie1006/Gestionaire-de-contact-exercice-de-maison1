Ce projet est un programme Java simple qui permet de gérer une liste de contacts.
La classe Contact représente un contact avec deux attributs : un nom et un numéro de téléphone.
Elle possède un constructeur sans paramètres qui permet de créer un contact vide, 
dont on remplit ensuite les attributs manuellement.
La classe ContactsManager gère une liste de contacts stockés dans un tableau de 500 cases
. Elle possède deux méthodes principales : addContact qui permet d'ajouter un contact à la liste,
et searchContact qui permet de rechercher un contact par son nom en parcourant le tableau un par un. 
Si le contact est trouvé, il est retourné, sinon la méthode retourne null.
La méthode main dans la classe Main est le point d'entrée du programme.
Elle crée plusieurs contacts, les ajoute au gestionnaire, puis effectue une recherche par nom. 
Si le contact est trouvé, son nom et son numéro de téléphone sont affichés à l'écran. 
Sinon, un message indique que le contact n'a pas été trouvé.
