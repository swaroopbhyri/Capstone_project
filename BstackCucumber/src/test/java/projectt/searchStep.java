package projectt;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class searchStep {
	WebDriver driver;

@Given("open website")
public void open_website() {
	driver = new ChromeDriver();
    driver.get("https://bstackdemo.com/");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
}

@When("search")
public void search() {
	Bstackpageclass pg = new Bstackpageclass(driver);
	pg.search();
}

@Then("search completed")
public void search_completed() {
    System.out.println("search completed");
    driver.close();
}




}
