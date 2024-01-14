import java.util.*;
public class MaisonEdition {
    // variables d'instance - remplacez l'exemple qui suit par le vôtre
    private List<Auteur> auteurs;
    private String reputation;
    private List<Observer> promoObservers = new ArrayList<>();

    /**
     * Constructeur d'objets de classe MaisonEdition
     */
    public MaisonEdition()
    {
        auteurs = new ArrayList<Auteur>();
        reputation = "Faible";
    }

    public void ajouterAuteur(Auteur auteur){
        auteurs.add(auteur);
        auteur.setEdition(this);
    }

    public void supprimerAuteur(Auteur auteur){
        auteurs.remove(auteur);
        auteur.setEdition(null);
    }
    public void updateReputation()
    {
        int nbLivres = getNbLivres();
        if (nbLivres<5){
            setReputation("Faible");
        }
        else if (nbLivres<10){
            setReputation("Moyenne");
        }
        else{
            setReputation("Forte");
        }
        notifyObservers();
    }

    public int getNbLivres() {
        int nbLivres = 0;
        for (Auteur auteur: auteurs)
            nbLivres+=auteur.nombreLivres();
        return nbLivres;
    }

    public List<Auteur> getAuteurs(){
        return auteurs;
    }

    public String getReputation(){
        return reputation;
    }

    public void setReputation(String reputation){
        this.reputation = reputation;
    }

    // fonctions qui permettent d'ajouter et de supprimer des auteurs qui sont intéressés par les changements de promotions
    public void addObserver(Observer observer) {
        promoObservers.add(observer);
    }

    public void removeObserver(Observer observer) {
        promoObservers.remove(observer);
    }

    public void notifyObservers() {
        String newPromotion = getPromotionForBubbleTea();
        for (Observer observer : promoObservers) {
            observer.updatePromotionChanges(newPromotion);
        }
    }

    public String getPromotionForBubbleTea() {
        String reputationLowerCase = reputation.toLowerCase();
        if ("forte".equals(reputationLowerCase)) {
            return "Promotion : 20% de réduction sur tous les Bubble Tea !";
        } else if ("moyenne".equals(reputationLowerCase)) {
            return "Promotion : 10% de réduction sur tous les Bubble Tea !";
        } else {
            return "Aucune promotion";
        }
    }

}