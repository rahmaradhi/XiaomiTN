package Pages;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Helper.Config;

public class ProductPage {
@FindBy(xpath="/html/body/div[2]/div[4]/div/div/div/div/div[3]/div[1]/div/div[1]/div/div[1]/h1")
WebElement productName;
@FindBy(xpath="/html/body/div[2]/div[4]/div/div/div/div/div[3]/div[1]/div/div[3]/div/form/div/div[2]/div/div[2]/div/div/div/div/a")
WebElement wishList;
@FindBy(xpath="/html/body/div[2]/header/div[1]/div/section/div/div[4]/div/section/div/div[1]/div/div/div/div/a")
WebElement wishListButton;
@FindBy(xpath="/html/body/div[1]/div[5]/section/div/div/div/form/table/tbody/tr/td[2]/a")
WebElement verifNomProduct;
	
	public ProductPage() {
		PageFactory.initElements(Config.driver, this);
	}
	
	public String verifProduct() {
		
		String actualMessage=productName.getText();
		return actualMessage;
	}
	public void clickOnWishList() {
		wishList.click();
	}
	
	public void wishListProduct() throws InterruptedException {
		
		WebDriverWait wait=new WebDriverWait(Config.driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.elementToBeClickable(wishListButton));
		Thread.sleep(6000);
		
		wishListButton.click();
		
	}
	public String  verifProduit() {
		String verifP=verifNomProduct.getText();
		return verifP;
		
	}
}
