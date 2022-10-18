package testCases;

import java.util.ArrayList;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pages.HomePage;
import pages.ProductDetails;
import utility.BaseClass;

@Listeners(utility.Listener.class)
public class Amazon_TestCase extends BaseClass {
	

	HomePage menu = PageFactory.initElements(driver, HomePage.class);
	ProductDetails pd =PageFactory.initElements(driver,  ProductDetails.class);
	
	SoftAssert softAssert = new SoftAssert();
	
	@Test(priority = 0)
	public void OpenMenu() throws Throwable {
		test = report.createTest(new Throwable().getStackTrace()[0].getMethodName());
		menu.openHamburgerMenu();
		WebElement catg=menu.getElement();
		scrolldown(catg);
		menu.openCategoryMenu();
		menu.openSubCategoryMenu();
		menu.selectItemCategory();
		 ArrayList<String> newTab = new ArrayList<String>(driver.getWindowHandles());
		 System.out.println("Arraysize:- "+newTab);
		 
	      //switch to new tab
	      driver.switchTo().window(newTab.get(1));
		
		
		boolean aboutItem=pd.itemInfo();
		
		softAssert.assertTrue(aboutItem, "About this item, not found");
		
		pd.fetureBullets();
		
		
		driver.switchTo().window(newTab.get(0));
		
		softAssert.assertAll();


	}
	
	
public void scrolldown(WebElement ele) {
		
		Actions actions = new Actions(driver);
		actions.moveToElement(ele);
		actions.perform();
	}
}
