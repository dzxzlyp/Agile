import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertEquals;

import java.util.*;

public class NotifyStepDef {
    private Auteur auteur;
    private MaisonEdition edition;

    @Given("une maison d'édition avec une réputation {string}")
    public void uneMaisonDÉditionAvecUneRéputation(String arg0) {
        edition = new MaisonEdition();
        edition.setReputation(arg0);
    }

    @And("un auteur dans cette maison d'édition avec le nom {string}")
    public void unAuteurDansCetteMaisonDÉditionAvecLeNom(String arg0) {
        auteur = new Auteur(arg0);
        edition.ajouterAuteur(auteur);
        edition.addObserver(auteur);
    }

    @When("la réputation de la maison d'édition devient {string}")
    public void laRéputationDeLaMaisonDÉditionDevient(String arg0) {
        ArrayList<String> books = new ArrayList<>(Arrays.asList("l1", "L2",
                "L3", "L4",
                "L5","L6",
                "L7", "L8",
                "L9","L10"));
        auteur.ajouterLivres(books);
    }

    @Then("l'auteur Xavier est notifié des changements de promotion")
    public void lAuteurXEstNotifiéDesChangementsDePromotion() {
        edition.updateReputation();
        assertEquals("Promotion : 20% de réduction sur tous les Bubble Tea !", edition.getPromotionForBubbleTea());
        String newPromotion = edition.getPromotionForBubbleTea();
        assertEquals("Auteur Xavier informé des changements de promotion. " +
                "Promotion : 20% de réduction sur tous les Bubble Tea !" ,auteur.updatePromotionChanges(newPromotion));
    }

}
