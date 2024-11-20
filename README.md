
Voici un README amélioré pour ton projet, prenant en compte les classes que tu as créées et leur structure.

markdown
Copy code
# Gestionnaire de Bibliothèque

## Description
Le **Gestionnaire de Bibliothèque** est une application Java qui permet de gérer une collection de livres. Ce projet, construit autour des principes de la programmation orientée objet, inclut des fonctionnalités pour ajouter, afficher, emprunter et supprimer des livres. Le tout fonctionne via une interface en ligne de commande.

Ce projet est un excellent point de départ pour démontrer des compétences en Java, notamment la gestion des classes, des collections, et les bases de la programmation orientée objet.

---

## Fonctionnalités
- **Ajouter un livre** : Permet d'ajouter un nouveau livre à la bibliothèque.
- **Afficher les livres disponibles** : Liste tous les livres présents dans la bibliothèque avec leurs détails.
- **Emprunter un livre** : Change l'état d'un livre pour indiquer qu'il a été emprunté.
- **Retourner un livre** : Remet un livre dans l'état "disponible".
- **Supprimer un livre** : Retire un livre de la bibliothèque en fonction de son titre.
- **Rechercher un livre** : Vérifie si un livre est présent dans la bibliothèque et affiche son état de disponibilité.

---

## Structure du projet
### Classes principales
1. **`Livre`** :
   - Représente un livre avec des attributs comme le titre, l'auteur, l'année de publication et l'état de disponibilité.
   - Principales méthodes :
     - `emprunter()` : Change l'état du livre en "indisponible".
     - `rendre()` : Change l'état du livre en "disponible".
     - `afficherDetails()` : Affiche les informations du livre.

2. **`Bibliotheque`** :
   - Représente une bibliothèque contenant une collection de livres.
   - Principales méthodes :
     - `ajouterLivre(Livre livre)` : Ajoute un livre à la collection.
     - `afficherLivresDisponibles()` : Affiche tous les livres disponibles.
     - `supprimerLivre(String titre)` : Supprime un livre par son titre.
     - `emprunterLivre(String titre)` : Change l'état d'un livre en "indisponible".
     - `retournerLivre(String titre)` : Change l'état d'un livre en "disponible".
     - `chercherLivre(String titre)` : Recherche un livre par son titre et affiche sa disponibilité.

3. **`Main`** :
   - Contient le point d'entrée de l'application.
   - Initialise la bibliothèque et les livres, puis interagit avec les fonctionnalités de la bibliothèque via la console.

---

## Exemple de scénario d'utilisation
1. Ajouter plusieurs livres à la bibliothèque.
2. Afficher tous les livres disponibles.
3. Emprunter un livre, puis vérifier qu'il est marqué comme "indisponible".
4. Retourner le livre emprunté et vérifier qu'il est de nouveau "disponible".
5. Supprimer un livre de la bibliothèque et afficher la collection restante.

---

## Technologies utilisées
- **Langage** : Java (version 8 ou supérieure)
- **IDE** : Replit
- **Structure** : Programmation orientée objet
