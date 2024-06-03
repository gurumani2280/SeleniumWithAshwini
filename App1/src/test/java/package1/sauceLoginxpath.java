package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import utils.CommonUtils;

public class sauceLoginxpath {

	public static void main(String[] args) throws InterruptedException
	{
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/");
		
		// //tagname[@attribute='value']
		driver.findElement(By.xpath("//input[@name='user-name']")).sendKeys("standard_user");
		
		
		driver.findElement(By.xpath("//*[@id='password']")).sendKeys("secret_sauce");
		
		//	tagname.classname	
		driver.findElement(By.xpath("//input[@data-test='login-button']")).click();
		CommonUtils.sleep(3000);
		driver.findElement(By.xpath("//*[@id='add-to-cart-sauce-labs-backpack']")).click();
		
		
		// //parentxpath/childxpath 

		driver.findElement(By.xpath("//*[@id='shopping_cart_container']/*[@class='shopping_cart_link']")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[@data-test='checkout']")).click();
		
		driver.findElement(By.xpath("//*[@id='first-name']")).sendKeys("first-name");
		driver.findElement(By.xpath("//*[@id='last-name']")).sendKeys("last-name");
		driver.findElement(By.xpath("//*[@id='postal-code']")).sendKeys("123456");
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//input[@value='Continue']")).click();
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//button[@data-test='finish']")).click();
		
		driver.quit();
	

	}

}
