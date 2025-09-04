package projectt;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class logoutStep {
	WebDriver driver;


@Given("website is opened and a account issss loggedin")
public void website_is_opened_and_a_account_issss_loggedin() {
	 driver = new ChromeDriver();
	    driver.get("https://bstackdemo.com/");
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
}

@When("click on logout")
public void click_on_logout() {
	  Bstackpageclass pg = new Bstackpageclass(driver);
	    pg.demologin();
	    pg.logout();
}

@Then("loggged out sucessfully")
public void loggged_out_sucessfully() {
	Assert.assertTrue(driver.findElement(By.id("signin")).isDisplayed(), "Logout failed!");
	System.out.println("loggged out sucessfully");
    driver.close();
}




}
