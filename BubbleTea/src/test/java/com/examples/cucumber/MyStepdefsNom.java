package com.examples.cucumber;

import com.examples.cucumber.Auteur;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.Assert.assertEquals;

public class MyStepdefsNom {
    private Auteur auteur;
    @Given("^My name is \"([^\"]*)\"$")
    public void myNameIs(String nom) {
        auteur = new Auteur();
        auteur.setNom(nom);
    }

    @When("^I change my name to \"([^\"]*)\"$")
    public void iChangeMyNameTo(String nom) {
        auteur.setNom(nom);
    }

    @Then("^My name should be \"([^\"]*)\"$")
    public void myNameShouldBe(String nom) {
        assertEquals(auteur.getNom(),nom);
    }
}
