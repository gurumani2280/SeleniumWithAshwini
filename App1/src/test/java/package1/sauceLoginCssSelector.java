package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sauceLoginCssSelector {

	public static void main(String[] args) throws InterruptedException
	{
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/");
		
		// tagname[attribute='value']
		driver.findElement(By.cssSelector("input[name='user-name']")).sendKeys("standard_user");
		
		// #id
		driver.findElement(By.cssSelector("#password")).sendKeys("secret_sauce");
		
		//	tagname.classname	
		driver.findElement(By.cssSelector("input.submit-button")).click();
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("#add-to-cart-sauce-labs-backpack")).click();
		
		
		// parentcssselector>childcssselector

		driver.findElement(By.cssSelector("#shopping_cart_container>.shopping_cart_link")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.cssSelector("button[data-test='checkout']")).click();
		
		driver.findElement(By.cssSelector("#first-name")).sendKeys("first-name");
		driver.findElement(By.cssSelector("#last-name")).sendKeys("last-name");
		driver.findElement(By.cssSelector("#postal-code")).sendKeys("123456");
		Thread.sleep(5000);
		
		driver.findElement(By.cssSelector("input[value='Continue']")).click();
		
		Thread.sleep(5000);
		
		driver.findElement(By.cssSelector("button[data-test='finish']")).click();
		
		driver.quit();
	

	}

}
