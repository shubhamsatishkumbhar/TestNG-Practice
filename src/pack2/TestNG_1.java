package pack2;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

//Verify Title(Assert) If test fail then it can't continue  stop at that point
public class TestNG_1 {
	
	@Test
	public void titleTest() {
		
		String expectedTitle = "Your Store";
		
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/");
		String actualTitle = driver.getTitle();
		
		Assert.assertEquals(actualTitle, expectedTitle);
		driver.close();
	}
}

//Varioud Test Annotations:- @Test,@BeforeTest,@AfterTest,@BeforClass,@AfterClass,@BeforeGroup,@AfterGroup,@BeforeSuits,@AfterSuits
