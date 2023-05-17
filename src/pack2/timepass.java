package pack2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class timepass {
	
	public static void main(String[] args) {
		System.out.println("heeloo");
		System.setProperty("webriver.chrome.driver","chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Register")).click();
		
		System.out.println(driver.findElement(By.xpath("/input[@type='radio]")).getSize());

	}

}
