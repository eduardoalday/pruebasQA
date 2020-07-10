package com.automationpractice.Testing.TestAutomation.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/BuyInTheShop.feature",
        glue= {"com.automationpractice.Testing.TestAutomation.stepDefinitions"}
)
public class ProductToTheShoppingCartRunner {

}
