package com.examples.cucumber;

import junit.framework.TestCase;

public class AuteurTest extends TestCase {
    Auteur lisa;
    public AuteurTest(){
        lisa = new Auteur();
        lisa.ajouterLivre("La guerre des clans");
        lisa.ajouterLivre("Tara Duncan");
        lisa.ajouterLivre("A fleur de toi");
    }

    public void testNombreLivres() {
        int nbLivres = lisa.nombreLivres();
        assertEquals(nbLivres, 3);
    }

    public void testAjouterLivre() {
        lisa.ajouterLivre("Six of Crows");
        assert(lisa.getLivres().contains("Six of Crows"));
    }


    public void testSupprimerLivre() {
        lisa.supprimerLivre("A fleur de toi");
        assert(!lisa.getLivres().contains("A fleur de toi"));
    }

}
