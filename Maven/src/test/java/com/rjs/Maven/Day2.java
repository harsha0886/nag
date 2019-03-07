package com.rjs.Maven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day2 {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.name("email")).sendKeys("harshachowdarygolla");
		driver.findElement(By.name("pass")).sendKeys("9491290886");
		driver.findElement(By.id("loginbutton")).click();
		
		String expectedTitle="Facebook";
		String observedTitle=driver.getTitle();
		if(observedTitle.equalsIgnoreCase(expectedTitle)) {
			System.out.println("Test case is pass");
		
		}
		else {
			System.out.println("Test case is fail");
		}
		
		
		
		
	
		
	}

}
