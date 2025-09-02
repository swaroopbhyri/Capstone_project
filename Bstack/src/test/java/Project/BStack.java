package Project;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class BStack {
	WebDriver driver;
	
	@BeforeTest
	  public void beforeTest() {
		  driver = new ChromeDriver();
		  driver.get("https://bstackdemo.com/");
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  }
  @Test (priority =1)
  public void login() {
	  Bstackpageclass pg = new Bstackpageclass(driver);
	  pg.demologin();
	  //pg.imagenotloadinguser();
	  //pg.existingordersuser();
	  //pg.favuser();
	  //pg.lockeduser();
  }
  

  
  
  @Test (priority = 2)
  public void addtocart() throws InterruptedException {
	  Bstackpageclass pg = new Bstackpageclass(driver);
	  pg.addtocart();
  }

  @Test(priority =3)
  public void deleteitemfromcart() {
	  Bstackpageclass pg = new Bstackpageclass(driver);
	  pg.deleteitemfromcart();
	  
  }
  
  @Test(priority = 4)
  public void buy() {
	  Bstackpageclass pg = new Bstackpageclass(driver);
	  pg.shippingaddress();
  }
  
  @Test(priority = 5)
  public void search() {
	  Bstackpageclass pg = new Bstackpageclass(driver);
	  pg.search();
  }
  
  @Test(priority = 6)
  public void shopbybrand() {
	  Bstackpageclass pg = new Bstackpageclass(driver);
	  pg.apple();
	  pg.samsung();
	  pg.oneplus();
	  pg.google();
  }
  
  @Test(priority = 7)
  public void orderby() {
	  Bstackpageclass pg = new Bstackpageclass(driver);
	  pg.orderBy();
	  
  }
  
  @Test(priority = 8)
  public void favourites() {
	  Bstackpageclass pg = new Bstackpageclass(driver);
	  pg.favourites();
  }
  
  @Test(priority = 9)
  public void offers() {
	  Bstackpageclass pg = new Bstackpageclass(driver);
	  pg.offers();
  }
  
  @Test(priority = 10)
  public void privacypolicy() {
	  Bstackpageclass pg = new Bstackpageclass(driver);
	  pg.privacypolicy();
  }
  
  @Test(priority = 11)
  public void logout() {
	  Bstackpageclass pg = new Bstackpageclass(driver);
	  pg.logout();
  }
  
  
  
  
  
  
  
  
  
  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}
