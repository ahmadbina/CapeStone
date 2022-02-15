//package core;
//
//
//
//import java.util.ArrayList;
//import java.util.List;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
//
//import io.github.bonigarcia.wdm.WebDriverManager;
//
//public class JavaEX {
//	public static WebDriver driver;
//	public static void main(String[] args) {
//		String text = " Success: You have added MacBook Air to your product comparison!";
//		int count =0;
//		for (int i = 0; i < text.length(); i++) {
//			char success = text.charAt(i);
//			count = text.length();
//			System.out.print(success);
//			
//			
//	}
////		System.out.println("\n"+count);
////		System.out.println("TamimBinaCheck: " + succdssYouhaveaddToTheCartText.getText());
////		String actualtext = succdssYouhaveaddToTheCartText.getText();
////		String expectedText = "Success: You have added MacBook Air to your product comparison!";
////		String subString = actualtext.substring(0, 63);
////
////		if (subString.contains(subString)) {
////			JavascriptExecutor js = (JavascriptExecutor) driver;
////			js.executeScript("arguments[0].style.border='2px solid red'", succdssYouhaveaddToTheCartText);
////			logger.info("this is the real text: " + subString);
////
////		} else {
////			logger.info("the text is not matching");
////		}
////		String text = expectedText;
////		int count = 0;
////		for (int i = 0; i < text.length(); i++) {
////			char success = text.charAt(i);
////			count = text.length();
////			System.out.print(success);
////		}
////		System.out.println("\n  The Count Text: " + count);
////		return true;
////
////	WebDriverManager.chromedriver().setup();
////	driver= new ChromeDriver();
////	driver.get("http://tek-school.com/retail/");
////	WebElement desktop=driver.findElement(By.xpath("//a[text()='Desktops']"));
////	desktop.click();
////	WebElement Show_All_Desktops=driver.findElement(By.xpath("//a[text()='Show All Desktops']"));
////	Show_All_Desktops.click();
////	WebElement Canoncameracart=driver.findElement(By.xpath("//div[@id='product-category']//div[4]/div[2]/div[1]/div[2]/div[2]/button[1]"));
////	Canoncameracart.click();
////	WebElement textconfirmation=driver.findElement(By.xpath("//div[@id='product-product']/div[1]"));
////	System.out.println(textconfirmation.getText());
////	List<String> list= new ArrayList<String>();
////	for (int i = 0; i <2 ; i++) {
////		WebElement listofitems=driver.findElement(By.xpath("//img[@class='img-responsive']"));
////		list.add(listofitems.getText());
////	}
////	System.out.println(list);
////	Actions action = new Actions(driver);
////	action.moveToElement(desktpop).perform();
////	action.moveToElement(Show_All_Desktops).perform();
////	JavascriptExecutor js = (JavascriptExecutor)driver;
////	js.executeScript("arguments[0]. click();", Show_All_Desktops);
////	JavascriptExecutor js = (JavascriptExecutor) driver;
////	js.executeScript("arguments[0].style.background='yellow'", element);
////}
//
////	
////	List<WebElement> allItems = driver.findElements(By.xpath("//div[@class='caption']"));
////	
////	List<String> listOfItems = new ArrayList<String>();
////	
////	for (int i = 0; i < allItems.size(); i++) {
////		listOfItems.add(allItems.get(i).getText());
////		System.out.print(", " + allItems.get(i).getText());
////	}
////	System.out.println();
////	System.out.println(listOfItems);
////	}
////	private static int charat(String text) {
////		// TODO Auto-generated method stub
////		return 0;
////	}
////	
////}
////	
//
////public boolean desktopTextverification() {
////	JavascriptExecutor js = (JavascriptExecutor) driver;
////	js.executeScript("arguments[0].style.border='2px solid red'",textConfirm());
//////	if(DesktopTextverification.isDisplayed()) {
////		return true;
////		
////	}else {
////		return false;
////	}
//}

