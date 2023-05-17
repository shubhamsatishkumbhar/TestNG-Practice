package pack2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNG_8 {
	@Test
	public void testTitle() {
		String expected = "Welcome: Mercury Tours";
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/newtours/");
		
		String actual = driver.getTitle();
		System.out.println("veryfying Title");
		Assert.assertEquals(actual, expected, "The verification failed");
		
		System.out.println("Closing Browser");
		driver.close();
	}
}
