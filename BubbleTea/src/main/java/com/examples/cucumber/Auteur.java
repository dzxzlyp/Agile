package com.examples.cucumber;

import java.util.*;

public class Auteur
{
    // variables d'instance - remplacez l'exemple qui suit par le vôtre
    private String nom;
    private List<String> livres;

    /**
     * Constructeur d'objets de classe Auteur
     */
    public Auteur()
    {
        // initialisation des variables d'instance
        nom = "";
        livres = new ArrayList<String>();
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

}