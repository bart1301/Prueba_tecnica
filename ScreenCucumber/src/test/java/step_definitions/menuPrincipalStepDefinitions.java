package step_definitions;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;

import tasks.seleccionarOpciones;
import tasks.abrirPagina;


import static net.serenitybdd.screenplay.GivenWhenThen.*;

public class menuPrincipalStepDefinitions {
	
	@Managed(driver="chrome")
	private WebDriver herBrowser;

	private Actor felipito = Actor.named("Felipito");

	@Steps
    abrirPagina abrirPagina;
	
	
	


	@Before
	public void setup() {
		felipito.can(BrowseTheWeb.with(herBrowser));
	}

	
	 	@Given("^Usuario ingreso a la pagina$")
	    public void usuario_ingreso_a_la_pagina(){
			givenThat(felipito).wasAbleTo(abrirPagina);
	     
	    }

	    @When("^Usuario ingresar a la opciones del menu$")
	    public void usuario_ingresar_a_la_opciones_del_menu(){
	    	felipito.attemptsTo(seleccionarOpciones.menu());
	    }

	    @Then("^usuario visualiza el menu principal $")
	    public void usuario_visualiza_el_menu_principal(){
	     	
	    }

}
