// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;

public class Main {
  public static void main(String[] args) {
    // System.out.println("Hello world!");
    Livre livre1 = new Livre("Le Seigneur des   Anneaux", "J.R.R." , 1954, true);
    Livre livre2 = new Livre("Harry Potter à l'École des Sorciers", "J.K. Rowling", 1997, true);
    Livre livre3 = new Livre("1984", "George Orwell", 1949, true);
    Livre livre4 = new Livre("Les Misérables", "Victor Hugo", 1862, true);
    Livre livre5 = new Livre("Dune", "Frank Herbert", 1965, true);


    // livre1.emprunter();
    // livre1.afficherDetails();
    // livre1.rendre();
    // livre1.afficherDetails();

    Bibliotheque Bibliotheque1 = new Bibliotheque("Scripta");

    Bibliotheque1.ajouterLivre(livre1);
    Bibliotheque1.ajouterLivre(livre2);
    Bibliotheque1.ajouterLivre(livre3);
    Bibliotheque1.ajouterLivre(livre4);
    Bibliotheque1.ajouterLivre(livre5);

    // Bibliotheque1.afficherLivresDisponibles();
    // Bibliotheque1.supprimerLivre("Dune");
    // Bibliotheque1.afficherLivresDisponibles();
    Bibliotheque1.emprunterLivre("1984");
    Bibliotheque1.chercherLivre("1984");
    Bibliotheque1.retournerLivre("1984");
    Bibliotheque1.chercherLivre("1984");
  }

  // @Test
  // void addition() {
  //     assertEquals(2, 1 + 1);
  // }
}