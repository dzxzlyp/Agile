package com.examples.cucumber;
import static org.junit.Assert.assertEquals;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class US_002 {
    private BubbleTea bt1 = new BubbleTea("Avril", 6.5);
    private BubbleTea bt2 = new BubbleTea("Neige", 6.5);
    private Toppings tp1 = new Toppings("Bubble", bt1);
    private Toppings tp2 = new Toppings("Taro", bt2);

    private Toppings tp;
    private String result;
    private String nameBt;

    @Given("the client want to have the topping {string}")
    public void theClientWantToHaveTheToppingNameTopping(String name) {
        if (tp1.getName().equals(name)){
            tp = tp1;
        }
        else{
            tp = tp2;
        }
    }

    @When("the name of bubble tea {string}")
    public void theNameOfBubbleTeaNameBT(String name) {
        nameBt = name;
    }

    @Then("tell him the content condition {string}")
    public void tellHimTheContentConditionIsContain(String resultTt) {
        assertEquals(resultTt, tp.verifyContain(nameBt));
    }
}
