package projectt;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class favStep {
	WebDriver driver;

@Given("website is open in ur sys")
public void website_is_open_in_ur_sys() {
	driver = new ChromeDriver();
    driver.get("https://bstackdemo.com/");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

   
}

@When("click on fav icon")
public void click_on_fav_icon() {
	Bstackpageclass pg = new Bstackpageclass(driver);
    pg.demologin();
    pg.favourites();
}

@Then("addtd to favourites")
public void addtd_to_favourites() {
    System.out.println("added to favourites");
    driver.close();
}




}
