package com.step.Definition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.adactin.runner.Runner_class;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Adactin {
	public static WebDriver driver=Runner_class.driver;
	@Given("the user is on the login page")
	public void the_user_is_on_the_login_page() {
	  driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
	}

	@When("the user enters the username and password")
	public void the_user_enters_the_username_and_password() {
	    driver.findElement(By.id("username")).sendKeys("Keerthana30");
	    driver.findElement(By.id("password")).sendKeys("abc@123");
	    driver.findElement(By.id("login")).click();
	    System.out.println("Entered Valid Credentials");
	}

	@Then("the user should be able to login successfully")
	public void the_user_should_be_able_to_login_successfully() {
	   System.out.println("Login successfull");
	}

	@Given("the user is on login page")
	public void the_user_is_on_login_page() {
		driver.navigate().back();
	}

	@When("the user enters the invalid username and password")
	public void the_user_enters_the_invalid_username_and_password() {
		driver.findElement(By.id("username")).sendKeys("");
	    driver.findElement(By.id("password")).sendKeys("");
	    driver.findElement(By.id("login")).click();
	    System.out.println("Entered Invalid Credentials");
	}

	@Then("{string} error will appear on the screen")
	public void error_will_appear_on_the_screen(String string) {
	    System.out.println("Invalid Credentials"+string);
	}


}
