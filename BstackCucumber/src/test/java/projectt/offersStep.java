package projectt;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class offersStep {
	WebDriver driver;

@Given("opennnn websitee")
public void opennnn_websitee() {
	  driver = new ChromeDriver();
	    driver.get("https://bstackdemo.com/");
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
}

@When("click offers")
public void click_offers() {
	 Bstackpageclass pg = new Bstackpageclass(driver);
	    pg.demologin();
	    pg.offers();
}

@Then("offers page opened")
public void offers_page_opened() {
   System.out.println("offers page opened");
   driver.close();
}




}
