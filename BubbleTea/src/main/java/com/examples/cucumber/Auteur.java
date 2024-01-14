import java.util.*;

public class Auteur implements Observer
{
    // variables d'instance - remplacez l'exemple qui suit par le vôtre
    private String nom;
    private List<String> livres;
    private MaisonEdition edition;

    /**
     * Constructeur d'objets de classe Auteur
     */
    public Auteur(String nomAuteur)
    {
        // initialisation des variables d'instance
        nom = nomAuteur;
        livres = new ArrayList<String>();
        edition = new MaisonEdition();
        edition.ajouterAuteur(this);
    }

    public int nombreLivres()
    {
        return livres.size();
    }

    public void ajouterLivre(String titre) {
        // Implémentation pour ajouter un livre à la liste
        livres.add(titre);
    }

    public void ajouterLivres(List<String> listeLivres){
        for (String livre: listeLivres){
            ajouterLivre(livre);
        }
    }

    public void supprimerLivre(String titre) {
        livres.remove(titre);
    }

    public String getNom(){
        return nom;
    }

    public List<String> getLivres(){
        return livres;
    }

    public void setNom(String nom){
        this.nom = nom;
    }

    public MaisonEdition getEdition(){
        return edition;
    }

    public void setEdition(MaisonEdition edition){
        this.edition = edition;
    }

    @Override
    public void updatePromotionChanges(String newPromotion) {
        if (this.getNom() != null) {
            System.out.println("Auteur " + this.getNom() + " informé des changements de promotion. " + newPromotion);
        } else {
            System.out.println("Auteur informé des changements de promotion. " + newPromotion);
        }
    }

}