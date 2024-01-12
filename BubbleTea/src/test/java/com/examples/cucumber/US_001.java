package com.examples.cucumber;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static org.junit.Assert.assertEquals;

public class US_001 {
    private BubbleTea bubbleTea;

    @Given("the price of bubble tea {string} is {double}")
    public void thePriceOfBubbleTeaNameBTIsPriceBT(String name, double price) {
        bubbleTea = new BubbleTea(name, price);
    }

    @When("the vendor give a promotion {double}")
    public void theVendorGiveAPromotionProm(double promotion) {
        bubbleTea.promotion(promotion);
    }

    @Then("the final price {double} should be calculated")
    public void theFinalPriceFinalPriceBTShouldBeCalculated(double finalPrice) {
        assertEquals(finalPrice, bubbleTea.getPrice(), 0.01);
    }
}
