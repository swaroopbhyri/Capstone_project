package projectt;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class orderbyStep {
	WebDriver driver;

@Given("open websiteeeee")
public void open_websiteeeee() {
	 driver = new ChromeDriver();
	    driver.get("https://bstackdemo.com/");
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
}

@When("orderBy")
public void order_by() {
	 Bstackpageclass pg = new Bstackpageclass(driver);
	 pg.orderBy();
}

@Then("soretd by prces")
public void soretd_by_prces() {
    System.out.println("soretd by prces");
    driver.close();
}




}
