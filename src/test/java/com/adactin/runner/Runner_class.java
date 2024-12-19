package com.adactin.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.github.bonigarcia.wdm.WebDriverManager;
@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\user\\eclipse-workspace\\CucumberProject\\src\\test\\java\\adactin.feature",glue="com.step.Definition",publish= true,plugin="html:target/cucumber-reports.html")
public class Runner_class {
	public static WebDriver driver;
	@BeforeClass
	public static void browserlaunch() {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		 driver= new ChromeDriver();
		 System.out.println("Browser Launche successfully");

	}
	@AfterClass
	public static void browserclose() {
		// TODO Auto-generated method stub
		driver.close();
		System.out.println("Browser closed successfully");

	}

	
}
