package com.examples.cucumber;

public class AuthorTeaAdapter {
    private Auteur auteur;
    private BubbleTea bubbleTea;

    public AuthorTeaAdapter(Auteur auteur, BubbleTea bubbleTea){
        this.auteur = auteur;
        this.bubbleTea = bubbleTea;
    }

    public String getFavoriteTeaName(){
        return bubbleTea.getName();
    }

    public double getFavoriteTeaPrice(){
        return bubbleTea.getPrice();
    }

    public int getPublishedBooksCount(){
        return auteur.nombreLivres();
    }

    public String getAuthorName(){
        return auteur.getNom();
    }
}
