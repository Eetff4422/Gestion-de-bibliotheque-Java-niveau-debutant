import java.util.ArrayList;

public class Bibliotheque {
  private String nomBibliotheque;
  private ArrayList<Livre> livres;

  public Bibliotheque(String nomBibliotheque){
    this.nomBibliotheque = nomBibliotheque;
    this.livres = new ArrayList<Livre>();
  }

  public void ajouterLivre(Livre livre){
    this.livres.add(livre);
    System.out.println("Ajout réussi du livre '"+ livre.getTitre() +"' dans la bibliothèque '" + this.nomBibliotheque + "'.");
  }

  public void afficherLivresDisponibles(){
    for (Livre livre : this.livres){
      livre.afficherDetails();
    }
  }

  public void supprimerLivre(String titre){
    for (int i = 0; i < this.livres.size(); i++){
      if (this.livres.get(i).getTitre().equals(titre)){
        this.livres.remove(i);
      }
    }
  }

  public void emprunterLivre(String titre){
    for (Livre livre : this.livres){
      if (livre.getTitre().equals(titre)){
        livre.setDisponible(false);
      }
    }
  }

  public void retournerLivre(String titre){
    for (Livre livre : this.livres){
      if (livre.getTitre().equals(titre)){
        livre.setDisponible(true);
      }
    }
  }

  public void chercherLivre(String titre){
    for (Livre livre : this.livres){
      if (livre.getTitre().equals(titre)){
        if (livre.getDisponible()){
         System.out.println("Le livre '"+ titre +"' est disponible dans la bibliothèque '" + this.nomBibliotheque + "'."); 
        } else {
        System.out.println("Le livre '"+ titre +"' n'est disponible pas dans la bibliothèque '" + this.nomBibliotheque + "'.");
        }
      }
    }
  }
  
  public String getNomBibliotheque(){
    return nomBibliotheque;
  }

  public void setNomBibliotheque(String nomBibliotheque){
    this.nomBibliotheque = nomBibliotheque;
  }

}