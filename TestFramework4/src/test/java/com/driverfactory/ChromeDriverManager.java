package com.driverfactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDriverManager implements BrowserDriver{

	public WebDriver createDriver() {
		return new ChromeDriver();
	}

}