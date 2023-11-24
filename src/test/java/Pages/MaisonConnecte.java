package Pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import Helper.Config;

public class MaisonConnecte {

	
	@FindBy(xpath="/html/body/div[2]/div[5]/div/div/div[1]/div/header/h1")
	WebElement verifMaisonC;
	
	@FindBy(name="orderby")
	WebElement tri;
	@FindBy(xpath="/html/body/div[2]/div[5]/div/div/div[1]/div/div[3]/div/div/div/div[2]/div[2]/h3/a")
	List<WebElement> listProduct;
	public MaisonConnecte() {
	PageFactory.initElements(Config.driver, this);
	}
	
	public  String verifMessagemc() {
		String actuelText=verifMaisonC.getText();
		return actuelText;
		
	}
	
	public void SortTriAndClick(String sortTri, String product ) {
		Select select= new Select(tri);
		select.selectByVisibleText(sortTri);
		try {
			for(WebElement produit:listProduct) {
				if(produit.getText().contains(product)) {
					produit.click();
				}
			}
			}catch(Exception e) {
				
			}
		}
		
}		

