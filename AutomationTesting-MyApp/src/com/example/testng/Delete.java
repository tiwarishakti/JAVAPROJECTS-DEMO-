package com.example.testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Delete {
	
	WebDriver webdriver = null;
	String URL = "http://localhost:4200/";

	@Test
	public void delete() {
		System.setProperty("webdriver.chrome.driver",
				"E:\\JAVAFSD\\drivers\\chromedriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver webdriver = new ChromeDriver();
		webdriver.get(URL);
		webdriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		webdriver.manage().window().maximize();
		webdriver.findElement(By.xpath("//button[normalize-space()='Admin LogIn']")).click();
		webdriver.findElement(By.xpath("//input[@id='username']")).sendKeys("Admin");
		webdriver.findElement(By.xpath("//input[@id='password']")).sendKeys("1234");
		webdriver.findElement(By.xpath("//button[normalize-space()='Submit']")).click();
		webdriver.findElement(By.xpath("//body[1]/app-root[1]/div[1]/div[2]/div[1]/app-myaadhar[1]/div[1]/div[1]/div[8]/div[1]/div[2]/div[1]/a[2]/i[1]")).click();
		webdriver.findElement(By.xpath("//button[normalize-space()='Yes']")).click();
		System.out.println("Deleted Successfully");
	}
}
