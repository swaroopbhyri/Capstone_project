package projectt;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class privacypolicyStep {
	WebDriver driver;

@Given("website is opeeeened")
public void website_is_opeeeened() {
	 driver = new ChromeDriver();
	    driver.get("https://bstackdemo.com/");
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
}

@When("click on privacypolicy")
public void click_on_privacypolicy() {
	Bstackpageclass pg = new Bstackpageclass(driver);
	pg.privacypolicy();
}

@Then("privacy policy page is opened")
public void privacy_policy_page_is_opened() {
    System.out.println("privacy policy page is opened");
    driver.close();
}




}
