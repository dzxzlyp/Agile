package com.examples.cucumber;

import com.examples.cucumber.Auteur;
import com.examples.cucumber.MaisonEdition;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class MyStepdefsReputation {
    private Auteur auteur;
    private MaisonEdition edition;


    @When("^I search for my reputation$")
    public void iSearchForMyReputation() {
        edition.updateReputation();
    }

    @Then("^My reputation is \"([^\"]*)\"$")
    public void myReputationIs(String reputation) {
        assertEquals(edition.getReputation(), reputation);
    }

    @Given("An author wrote the following books:")
    public void anAuthorWroteTheFollowingBooks(List<String> livres) {
        auteur = new Auteur();
        edition = new MaisonEdition();
        edition.setAuteur(auteur);
        auteur.ajouterLivres(livres);
    }
}
