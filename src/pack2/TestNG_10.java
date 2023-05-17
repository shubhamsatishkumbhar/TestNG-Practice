package pack2;

//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import org.testng.annotations.Test;

public class TestNG_10 {
	WebDriver driver =new ChromeDriver();
	@Test(priority=1)
	public void test1() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver.get("https://opensource-demo.orangehrmlive.com/");
		//driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		String loginText =driver.findElement(By.id("logInPanelHeading")).getText();
		Assert.assertTrue(loginText.contains("Panel"),"Login Page doesnot displayed");
		System.out.println("Login page opened Successfull.");	
		
	}
	@Test(dependsOnMethods="test1")
	public void test2() throws InterruptedException {
		//driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		Thread.sleep(2000);
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		String AccName = driver.findElement(By.id("welcome")).getText();
		Assert.assertTrue(AccName.contains("Paul"),"name not displayed");
		System.out.println("Name Displayed as Expected");
		
	}
	@Test(dependsOnMethods="test2")
	public void test3() {
		//driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.findElement(By.id("welcome")).click();
		driver.findElement(By.linkText("Logout")).click();
		String url = driver.getCurrentUrl();
		Assert.assertTrue(url.contains("auth/login"),"Link not appended");
		System.out.println("Logout Successfully.");
		
		
	
	}
}
