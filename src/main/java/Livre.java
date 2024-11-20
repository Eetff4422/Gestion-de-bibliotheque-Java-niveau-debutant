public class Livre {
  private String titre;
  private String auteur;
  private int anneePublication;
  private boolean disponible;

  public Livre(String titre, String auteur, int anneePublication, boolean disponible){
    this.titre = titre;
    this.auteur = auteur;
    this.anneePublication = anneePublication;
    this.disponible = disponible;
  }

  public void emprunter(){
    this.disponible = false;
  }

  public void rendre(){
    this.disponible = true;
  }
  
  public boolean estDisponible(){
    return this.disponible;
  }
  
  public String getTitre() {
    return titre;
  }
  public void setTitre(String titre) {
    this.titre = titre;
  }
  
  public String getAuteur() {
    return auteur;
  }
  public void setAuteur(String auteur) {
    this.auteur = auteur;
  }
  
  public int getAnneePublication() {
    return anneePublication;
  }
  public void setAnneePublication(int anneePublication) {
    this.anneePublication = anneePublication;
  }

  public boolean getDisponible() {
    return disponible;
  }
  public void setDisponible(boolean disponible) {
    this.disponible = disponible;
  }

  public void afficherDetails(){
    System.out.println("Titre: " + this.titre);
    System.out.println("Auteur: " + this.auteur);
    System.out.println("Année de publication: " + this.anneePublication);
    if (this.disponible == true){
      System.out.println("Disponibilité : en stock");
    } else {
      System.out.println("Disponibilité : indisponible");
    }
  }
  
}