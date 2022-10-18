package pages;

import java.util.List;

//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
//import org.openqa.selenium.support.ui.ExpectedConditions;

public class HomePage  {

	// Master Setting

	@FindBy(how = How.ID, using = "nav-hamburger-menu")
	private WebElement hamburgerMenu;

	@FindBy(how = How.XPATH, using = "//a//div[text()='TV, Appliances, Electronics']")
	private WebElement tvAppliancesAndElectronics;

	@FindBy(how = How.LINK_TEXT, using = "Televisions")
	private WebElement televisions;

	@FindBy(how = How.XPATH, using = "//li//a//span[text()='Samsung']")
	private WebElement brandsSamsung;


	@FindBy(how = How.ID, using = "a-autoid-0-announce")
	private WebElement sortBy;

	@FindBy(how = How.LINK_TEXT, using = "Price: High to Low")
	private WebElement sortByPriceHighToLow;

	@FindAll(@FindBy(how = How.XPATH, using = "//div[contains(@data-asin,'B0')]"))
	private List<WebElement> productList;

	@FindBy(how = How.XPATH, using = "//h1[text()=' About this item ']")
	private WebElement headerOfFeatureBullets;

	@FindAll(@FindBy(how = How.XPATH, using = "//*[@id='feature-bullets']/ul/li"))
	private List <WebElement> featureBullets;
		

	

	@FindBy(how = How.XPATH, using = "Xpath")
	private WebElement ElementName;

	public void openHamburgerMenu() {
		hamburgerMenu.click();
	}
	
	
	public WebElement getElement() {
		return tvAppliancesAndElectronics;
	}

	public void openCategoryMenu() {
		tvAppliancesAndElectronics.click();
	}
	
	public void openSubCategoryMenu() {
		televisions.click();
	}
	
	public void selectItemCategory() {
		brandsSamsung.click();
		sortBy.click();
		sortByPriceHighToLow.click();
		//Select second Highest Priced Item
		productList.get(1).click();
	}
	


}
