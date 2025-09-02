package projectt;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class addtocartStep {
	WebDriver driver;

@Given("website is open and account loggedin")
public void website_is_open_and_account_loggedin() {
	 driver = new ChromeDriver();
	    driver.get("https://bstackdemo.com/");
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
}

@When("additemtocart")
public void additemtocart() throws InterruptedException {
    Bstackpageclass pg = new Bstackpageclass(driver);
    pg.demologin();
    pg.addtocart();
}

@Then("added sucessfully")
public void added_sucessfully() {
    System.out.println("added sucessfully");
    driver.close();
}




}
