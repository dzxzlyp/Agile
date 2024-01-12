package com.examples.cucumber;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.Assert.assertEquals;

public class MyStepdefsBubbleTea {
    private Auteur auteur;
    private BubbleTea bt;
    private AuthorTeaAdapter adapter;

    @Given("^An author favorite bubble tea is \"([^\"]*)\"$")
    public void anAuthorFavoriteBubbleTeaIs(String nomBT) throws Throwable {
        auteur = new Auteur();
        bt = new BubbleTea(nomBT,5.0);
    }

    @When("^I search for his favorite bubble tea$")
    public void iSearchForHisFavoriteBubbleTea() {
        adapter = new AuthorTeaAdapter(auteur, bt);
    }

    @Then("^It should be \"([^\"]*)\"$")
    public void itShouldBe(String favBT) throws Throwable {
        assertEquals(favBT, adapter.getFavoriteTeaName());
    }
}
