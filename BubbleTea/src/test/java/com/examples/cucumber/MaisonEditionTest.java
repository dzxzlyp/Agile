package com.examples.cucumber;

import junit.framework.TestCase;

import java.util.ArrayList;
import java.util.List;

public class MaisonEditionTest extends TestCase {
    private MaisonEdition gallimard;
    private List<Observer> promoObservers = new ArrayList<>();

    public MaisonEditionTest(){
        gallimard = new MaisonEdition();
    }

    public void testAjouterAuteur() {
        Auteur lisa = new Auteur();
        gallimard.ajouterAuteur(lisa);
        assertEquals(lisa.getEdition(), gallimard);
        assert(gallimard.getAuteurs().contains(lisa));
    }

    public void testSupprimerAuteur() {
        Auteur lisa = new Auteur();
        gallimard.ajouterAuteur(lisa);
        gallimard.supprimerAuteur(lisa);
        assertNull(lisa.getEdition());
        assert(!gallimard.getAuteurs().contains(lisa));
    }

    public void testUpdateReputation() {
        Auteur lisa = new Auteur();
        Auteur j_k_rowling = new Auteur();
        Auteur sarah = new Auteur();
        lisa.ajouterLivre("La guerre des clans");
        lisa.ajouterLivre("Tara Duncan");
        lisa.ajouterLivre("A fleur de toi");
        j_k_rowling.ajouterLivre("Harry Potter 1");
        j_k_rowling.ajouterLivre("Harry Potter 2");
        j_k_rowling.ajouterLivre("Harry Potter 3");
        j_k_rowling.ajouterLivre("Harry Potter 4");
        j_k_rowling.ajouterLivre("Harry Potter 5");
        j_k_rowling.ajouterLivre("Harry Potter 6");
        sarah.ajouterLivre("Gardiens des cités perdues 1");
        sarah.ajouterLivre("Gardiens des cités perdues 2");
        sarah.ajouterLivre("Gardiens des cités perdues 3");
        gallimard.ajouterAuteur(lisa);
        gallimard.ajouterAuteur(j_k_rowling);
        gallimard.ajouterAuteur(sarah);
        gallimard.updateReputation();
        assertEquals(gallimard.getReputation(), "Forte");
    }

    public void testAddObserver() {
        Auteur sarah = new Auteur();
        promoObservers.add(sarah);
        assert(promoObservers.contains(sarah));
    }

    public void testRemoveObserver() {
        Auteur sarah = new Auteur();
        promoObservers.add(sarah);
        promoObservers.remove(sarah);
        assert(!promoObservers.contains(sarah));
    }

    public void testNotifyObservers() {
        String newPromotion = gallimard.getPromotionForBubbleTea();
        for (Observer observer : promoObservers) {
            observer.updatePromotionChanges(newPromotion);
            assertEquals("Auteur informé des changements de promotion. " + newPromotion,observer.updatePromotionChanges(newPromotion));
        }
    }

    public void testGetPromotionForBubbleTea() {
        String newPromotion = gallimard.getPromotionForBubbleTea();
        assertEquals("Aucune promotion",newPromotion);

    }

}
