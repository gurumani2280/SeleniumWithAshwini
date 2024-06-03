package utils;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SeleniumUtils

{

	public static void selectDropDownByValue(WebElement ele, String value) {

		Select s1 = new Select(ele);

		s1.selectByValue(value);
	}

	public static void selectDropDownVisibleText(WebElement ele, String text) {
		Select s1 = new Select(ele);

		s1.selectByVisibleText(text);
	}

	public static void selectDropDownindex(WebElement ele, int i) {
		Select s1 = new Select(ele);

		s1.selectByIndex(i);
	}

}
