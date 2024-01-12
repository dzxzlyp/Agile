package com.examples.cucumber;

public class AuthorInfoFacade {
    private AuthorTeaAdapter adapter;

    public AuthorInfoFacade(Auteur auteur, BubbleTea bubbleTea){
        this.adapter = new AuthorTeaAdapter(auteur, bubbleTea);
    }

    public String getAuthorInfo(){
        String favoriteTeaName = adapter.getFavoriteTeaName();
        double favoriteTeaPrice = adapter.getFavoriteTeaPrice();
        int publishedBooksCount = adapter.getPublishedBooksCount();

        return "Auteur" + adapter.getAuthorName() + "'s favorite bubble tea is: " + favoriteTeaName + ". Price : " + favoriteTeaPrice + ". \n Number of books published : " + publishedBooksCount;
    }

}
