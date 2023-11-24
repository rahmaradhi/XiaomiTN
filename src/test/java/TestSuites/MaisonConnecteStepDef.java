package TestSuites;

import java.io.IOException;

import org.junit.Assert;

import Helper.Config;
import Helper.Utils;
import Pages.MaisonConnecte;
import Pages.ProductPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MaisonConnecteStepDef {


@Given("Utilisateur est sur la page de maison connecte")
public void utilisateur_est_sur_la_page_de_maison_connecte() throws IOException {
    Config.ConfChrome();
    Config.navigateUrl(Utils.getProperty("Web_MaisonConnectee_Link"));
    Config.maximizeWindow();
}

@When("utilisateur effectue le tri par {string} et clique sur le produit {string}")
 public void utilisateur_effectue_le_tri_par_et_clique_sur_le_produit( String tri,String productName) {
	MaisonConnecte maisonC= new MaisonConnecte();
	maisonC.SortTriAndClick(tri, productName);
}

@Then("Utilisateur est dirige vers la page du produit {string}")
public void utilisateur_est_dirige_vers_la_page_du_produit(String expectedName) {
	ProductPage pp=new ProductPage();
	String actualName= pp.verifProduct();
	Assert.assertEquals(expectedName, actualName);
	Config.quit();
}


}
