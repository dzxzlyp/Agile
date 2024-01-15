package com.examples.cucumber;

public class AuthorInfoFacade {
    private Auteur auteur;
    private BubbleTea bubbleTea;

    public AuthorInfoFacade(Auteur auteur, BubbleTea bubbleTea){
        this.auteur = auteur;
        this.bubbleTea = bubbleTea;
    }

    public String getAuthorInfo(){
        return "Auteur" + auteur.getNom() + "'s favorite bubble tea is: " + bubbleTea.getName() + ". Price : " + bubbleTea.getPrice() + ". \n Number of books published : " + auteur.nombreLivres();
    }
}

