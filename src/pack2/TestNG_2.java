package pack2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

//Assert(Soft Assert)If first test case is fail to fo on next without stucking.
public class TestNG_2 {
	@Test
	public void titleTest() {
		SoftAssert softassert = new SoftAssert();
		
		String expectedTitle = "Your Store";
		String expectedText = "Search";
		
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/");
		
		String actualTitle = driver.getTitle();
		System.out.println("Veryfying Title");
		softassert.assertEquals(actualTitle, expectedTitle, "Test Verification Failed");
		
		String actualText = driver.findElement(By.xpath("//*[@id=\"button-search\"]")).getAttribute("id");
		System.out.println("Veryfying Text");
		softassert.assertEquals(actualText, expectedText, "Title verification Failed");
		
		System.out.println("Closing Browser");
		
		driver.close();
		softassert.assertAll();
	}
}
