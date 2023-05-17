package pack2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG_9 {
	
	WebDriver driver = new ChromeDriver();
	@BeforeMethod
	public void login() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver.get("https://demo.guru99.com/test/newtours/");
		driver.manage().window().maximize();
		driver.findElement(By.name("userName")).sendKeys("tutorial");
		driver.findElement(By.name("password")).sendKeys("tutorial");
		driver.findElement(By.xpath("//input[@value='Submit']")).click();
	
	}
	@Test
	public void VerifyMsg() {
		System.out.println(driver.getTitle());
		String msg = driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[1]/td/h3")).getText();
		Assert.assertEquals(msg, "Login Successfully", "Msg not displayed as Expected");
		System.out.println("Test done successfylly.");
	}
	@AfterMethod
	public void logout() {
		driver.findElement(By.linkText("SIGN-OFF")).click();
		driver.close();
	}
}
