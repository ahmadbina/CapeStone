package Utilites;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import core.Base;

public class Utilite extends Base{
public static WebDriverWait wait;
	
	@SuppressWarnings("deprecation")
	public static void waitAndClickElement(WebElement element) {
		boolean clicked = false;
		int attempts = 0;
		while(!clicked && attempts < 10) {
			try {
			wait = new WebDriverWait(driver, 20);
			wait.until(ExpectedConditions.elementToBeClickable(element)).click();
			System.out.println("Successfully clicked on the WebElement: " + "=" + element.toString());
			clicked = true;
			} catch (Exception e) {
				try {
					logger.info("Failed to click the element");
				} catch (Exception e2) {
				}
				Assert.fail("Unable to click the element: " + "=" +  element.toString());
			}	
		attempts++;
		}	
	}
	
	public static void compareText(String actualText, String expectedText) {

		if (actualText.equalsIgnoreCase(expectedText)) {
			System.out.println(actualText + " = " + expectedText + "Passed");
		} else {
			System.out.println(actualText + " != " + expectedText + "Failed");
		}
	}


}
