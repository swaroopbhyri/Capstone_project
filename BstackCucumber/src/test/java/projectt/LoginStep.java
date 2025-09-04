package projectt;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStep {
	WebDriver driver;

@Given("open Bstack website")
public void open_bstack_website() {
    driver = new ChromeDriver();
    driver.get("https://bstackdemo.com/");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
}

@When("login")
public void login() {
    Bstackpageclass pg = new Bstackpageclass(driver);
    pg.demologin();
//    pg.imagenotloadinguser();
//    pg.existingordersuser();
//    pg.favuser();
//    pg.lockeduser();
  
}

@Then("logged in sucessfully")
public void logged_in_sucessfully() {
	Assert.assertTrue(driver.findElement(By.id("signin")).isDisplayed(), "Login failed!");
    System.out.println("login sucessfull");
    driver.close();
}


}
