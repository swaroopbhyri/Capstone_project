package projectt;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class deleteStep {
	WebDriver driver;

@Given("open webiste and login")
public void open_webiste_and_login() {
	driver = new ChromeDriver();
    driver.get("https://bstackdemo.com/");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
}

@When("delete")
public void delete() throws InterruptedException {
	Bstackpageclass pg = new Bstackpageclass(driver);
    pg.demologin();
    pg.addtocart();
    pg.deleteitemfromcart();
}

@Then("deleted sucessfully")
public void deleted_sucessfully() {
    System.out.println("deleted sucessfully");
    driver.close();
}



}
