package TestSuites;

import java.io.IOException;

import org.junit.Assert;

import Helper.Config;
import Helper.Utils;
import Pages.ProductPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class WishListStepDef {
	@Given("utilisateur est sur la page du produit choisi")
	public void utilisateur_est_sur_la_page_du_produit_choisi() throws IOException {
	    Config.ConfChrome();
	    Config.navigateUrl(Utils.getProperty("Web_WishList_Link"));
	    Config.maximizeWindow();
	}

	@When("utilisateur clique sur  ajouter a la liste de souhaits")
	public void utilisateur_clique_sur_ajouter_a_la_liste_de_souhaits() throws InterruptedException {
		ProductPage produit=new ProductPage();
		Thread.sleep(3000);;
		produit.clickOnWishList();
	}

	@Then("utlisateur est dirige vers la page de la liste de souhaits et verifie le produit ajouter a la liste")
	public void utlisateur_est_dirige_vers_la_page_de_la_liste_de_souhaits_et_verifie_le_produit_ajouter_a_la_liste() throws InterruptedException {
		ProductPage produit=new ProductPage();
		produit.wishListProduct();
		
		String productName= produit.verifProduit();
		Assert.assertEquals("Mi Wireless Outdoor Security Camera 1080p Set" ,productName);
		Thread.sleep(3000);
		Config.quit();
		
	}
}
