package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import utils.SeleniumUtils;

public class RegisterDemoWebsiteSelectClassOptomized 
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
		SeleniumUtils.selectDropDownByValue(country, "Australia");
		

		
		
		
		WebElement year=driver.findElement(By.id("yearbox"));
		
		SeleniumUtils.selectDropDownByValue(year, "1956");
		
		WebElement month=driver.findElement(By.xpath("//select[@placeholder='Month']"));
		
		SeleniumUtils.selectDropDownByValue(month, "July");		
		
		WebElement day=driver.findElement(By.id("daybox"));
				
		SeleniumUtils.selectDropDownByValue(day, "4");	
		Thread.sleep(8000);
		driver.quit();
		
	}
}