package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class RegisterDemoWebsiteSelectClass 
{
	
	public static void main(String[] args) throws InterruptedException
	{
		
		WebDriver driver=new EdgeDriver();
		
		driver.get("https://demo.automationtesting.in/Register.html");
		
		driver.manage().window().maximize();
		
		
		
		WebElement skilldropdown=driver.findElement(By.id("Skills"));
		
		Select s1=new Select(skilldropdown);
		
		s1.selectByIndex(2);
		Thread.sleep(6000);
		s1.selectByValue("Content Management Systems (CMS)");
		Thread.sleep(4000);
		s1.selectByVisibleText("Diagnostics");
		
		
		
		WebElement country=driver.findElement(By.id("country"));
		Select s2=new Select(country);
		
		s2.selectByValue("Australia");
		
		//countries
		
		
		
		WebElement year=driver.findElement(By.id("yearbox"));
		Select s3=new Select(year);
		
		s3.selectByValue("1956");
		
		WebElement month=driver.findElement(By.xpath("//select[@placeholder='Month']"));
		Select s4=new Select(month);
		
		s4.selectByValue("July");
				
		
		WebElement day=driver.findElement(By.id("daybox"));
		Select s5=new Select(day);
		
		s5.selectByValue("4");
		
		
		Thread.sleep(8000);
		driver.quit();
		
	}
}