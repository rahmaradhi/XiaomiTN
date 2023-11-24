package TestSuites;

import java.io.IOException;

import org.junit.Assert;

import Helper.Config;
import Helper.Utils;
import Pages.MaisonConnecte;
import Pages.XiaomiHomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomePageXiaomiStepDef {

	@Given("Utilisateur est sur la page d acceuil")
	public void utilisateur_est_sur_la_page_d_acceuil() throws IOException {
	    Config.ConfChrome();
	    Config.navigateUrl(Utils.getProperty("Web_Homepage_Link"));
	    Config.maximizeWindow();
	}

	@When("Utilisateur survole la souris sur le menu {string} et clique sur le submenu {string}")
	public void utilisateur_survole_la_souris_sur_le_menu_et_clique_sur_le_submenu(String menu, String submenu) throws InterruptedException {
		XiaomiHomePage home= new XiaomiHomePage();
		Thread.sleep(3000);
		home.mousehoverOnmenu(menu);
		Thread.sleep(3000);
		home.clickOnProduct(submenu);
		
		
	}

	@Then("Utilisateur est dirige vers la page {string}")
	public void utilisateur_est_dirige_vers_la_page(String expectedText) {
		MaisonConnecte mc= new MaisonConnecte();
		String actuelText=mc.verifMessagemc();
		Assert.assertEquals(expectedText, actuelText);
		Config.quit();
		
		
		
	}
}
