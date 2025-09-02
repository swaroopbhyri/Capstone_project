package projectt;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

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
}

@Then("loggged out sucessfully")
public void loggged_out_sucessfully() {
	System.out.println("loggged out sucessfully");
    driver.close();
}




}
