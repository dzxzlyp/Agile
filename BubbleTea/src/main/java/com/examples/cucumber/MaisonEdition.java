package com.examples.cucumber;

import com.examples.cucumber.Auteur;

import java.util.*;

public class MaisonEdition
{
    // variables d'instance - remplacez l'exemple qui suit par le vôtre
    private List<Auteur> auteurs;
    private String reputation;

    /**
     * Constructeur d'objets de classe MaisonEdition
     */
    public MaisonEdition()
    {
        auteurs = new ArrayList<Auteur>();
        reputation = "Moyen";
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
            setReputation("Moyen");
        }
        else{
            setReputation("Forte");
        }
    }

    private int getNbLivres() {
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
}
