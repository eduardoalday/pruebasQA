package com.automationpractice.Testing.TestAutomation.stepDefinitions;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.WebDriver;

import com.automationpractice.Testing.TestAutomation.pages.HomeYourLogoPage;
import com.automationpractice.Testing.TestAutomation.pages.ProductOverviewPage;
import com.automationpractice.Testing.TestAutomation.pages.SearchResultsPage;
import com.automationpractice.Testing.TestAutomation.validationPage.ShoppingCartSummary;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utils.PageGenerator;

public class PruebaStepDefinition {

	protected WebDriver driver = Hook.getDriver();
/*
	@Given("^that I opened the browser at automationpractice page$")
	public void thatIOpenedBrowserAtAutomationpracticePage() throws Throwable {

		PageGenerator.getInstance(HomeYourLogoPage.class, driver).goToThePage();
	}

	@When("^I look for '(.*)' and select any displayed result to go to the shopping cart$")
	public void iLookForDressAndSelectAny(String product) throws Throwable {

		PageGenerator.getInstance(HomeYourLogoPage.class, driver).findProduct(product);
		PageGenerator.getInstance(SearchResultsPage.class, driver).chooseRandomProduct();
		PageGenerator.getInstance(ProductOverviewPage.class, driver).addToShoppingCart();
	}

	@Then("^should the shopping cart show the product is not '(.*)'$")
	public void inTheShoppingCartShowTheProductIsNotNullWithQuantityNotNull(String result) throws Throwable {
		assertEquals(result, PageGenerator.getInstance(ShoppingCartSummary.class, driver).validateShoppingCart());
	}
*/	
	
	
	
	@Given("^Se abre el navegador con la automatizacion$")
	public void se_abre_el_navegador_con_la_automatizacion() throws Throwable {
	   System.out.println("el DADO");
	    
	}

	@When("^se busca por 'dress' se selecciona y el resultado se muestra en el carrito$")
	public void se_busca_por_dress_se_selecciona_y_el_resultado_se_muestra_en_el_carrito()throws Throwable {
	    
		System.out.println("el CUANDO");
	}

	@Then("^se debe mostrar que el carrito no esta vacio 'null'$")
	public void se_debe_mostrar_que_el_carrito_no_esta_vacio_null() throws Throwable {
	    
		System.out.println("el ENTONCES");
	}

	
	
	
}
