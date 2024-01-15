package com.examples.cucumber;

import junit.framework.TestCase;

import static org.junit.Assert.assertEquals;

public class AuthorInfoFacadeTest extends TestCase{
    Auteur lisa;
    BubbleTea brownSugar;
    public AuthorInfoFacadeTest(){
        lisa = new Auteur();
        lisa.ajouterLivre("La guerre des clans");
        lisa.ajouterLivre("Tara Duncan");
        lisa.ajouterLivre("A fleur de toi");
        lisa.setNom("Lisa");
        brownSugar = new BubbleTea("Brown Sugar", 4.99);
    }
    public void testGetAuthorInfo(){
        assertEquals("Auteur " + lisa.getNom() + "'s favorite bubble tea is: " + brownSugar.getName() + ". Price : " + brownSugar.getPrice() + ". \n Number of books published : " + lisa.nombreLivres(), "Auteur Lisa's favorite bubble tea is: Brown Sugar. Price : 4.99. \n Number of books published : 3");
    }
}
