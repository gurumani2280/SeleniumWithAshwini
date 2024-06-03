package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class RegisterDemoWebsite 
{
	
	public static void main(String[] args) throws InterruptedException
	{
		
		WebDriver driver=new EdgeDriver();
		
		driver.get("https://demo.automationtesting.in/Register.html");
		
		driver.findElement(By.cssSelector("#imagesrc")).sendKeys("C:\\Ash\\C#\\Introduction.docx");
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Fn");
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Ln");
		driver.findElement(By.cssSelector("textarea[ng-model='Adress']")).sendKeys("Address");
		
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("email@gmail.com");
		driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("123456789");
		
		driver.findElement(By.xpath("//input[@value='FeMale']")).click();
		
		driver.findElement(By.cssSelector("#checkbox1")).click();
		driver.findElement(By.cssSelector("#checkbox2")).click();
		driver.findElement(By.cssSelector("#checkbox3")).click();
		
		driver.findElement(By.cssSelector("#msdd")).click();
		driver.findElement(By.linkText("Arabic")).click();
		driver.findElement(By.linkText("Bulgarian")).click();
		driver.findElement(By.linkText("Danish")).click();
		
		driver.findElement(By.xpath("//input[@id='firstpassword']")).sendKeys("Password1");
		
		driver.findElement(By.xpath("//input[@id='secondpassword']")).sendKeys("Password2");
		
		driver.findElement(By.xpath("//button[@id='submitbtn']")).click();
		
		//driver.quit();
				
		/*
		 
		 */
		

	}
}