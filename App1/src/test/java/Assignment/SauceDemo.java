package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SauceDemo {

	public static void main(String[] args) throws InterruptedException
	{
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.name("user-name")).sendKeys("standard_user");
		driver.findElement(By.name("password")).sendKeys("secret_sauce");
		driver.findElement(By.name("login-button")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
		//Thread.sleep(3000);
		driver.findElement(By.className("shopping_cart_link")).click();
		driver.findElement(By.id("checkout")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("first-name")).sendKeys("first-name");
		driver.findElement(By.id("last-name")).sendKeys("last-name");
		driver.findElement(By.id("postal-code")).sendKeys("123456");
		Thread.sleep(5000);
		driver.findElement(By.id("continue")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.id("finish")).click();
		//finish
		//driver.quit();
		

	}

}
