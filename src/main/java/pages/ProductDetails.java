package pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ProductDetails {
	
	@FindBy(how = How.XPATH, using = "//h1[text()=' About this item ']")
	private WebElement headerOfFeatureBullets;

	

	@FindAll(@FindBy(how = How.XPATH, using = "//*[@id='feature-bullets']/ul/li"))
	private List <WebElement> featureBullets;
	
	
	public boolean itemInfo() {
		String infoItem = headerOfFeatureBullets.getText();
		if (infoItem.contains("About this item")) {
			return true;
		} else {
			return false;
		}
	}
	
	public void fetureBullets() {
		for (int i=0; i<featureBullets.size();i++) {
			System.out.println(featureBullets.get(i).getText());
		}
	}

}
