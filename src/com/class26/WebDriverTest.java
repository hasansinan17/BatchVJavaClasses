package com.class26;

public class WebDriverTest {
	public static void main(String[] args) {
		ChromeDriver chrome=new ChromeDriver();
		chrome.refresh();
		chrome.open();
		
		FirefoxDriver firefox=new FirefoxDriver();
		firefox.refresh();
		firefox.open();
		//creating an object of child class and given referance to the
		WebDriver driver=new FirefoxDriver();
		
		driver.open();
		driver.refresh();
		//driver.getTitle();//--> no access to child specific class through parent type
		
	}

}
