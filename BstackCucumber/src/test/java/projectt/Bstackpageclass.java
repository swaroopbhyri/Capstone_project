package projectt;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Bstackpageclass {
	WebDriver driver;
	WebDriverWait wait;
	By search = By.xpath("//*[@id=\"__next\"]/div/div/div[1]/div/div/div[2]/div/input");
	By searchButton = By.xpath("//*[@id=\"__next\"]/div/div/div[1]/div/div/div[2]/div/button");
	
	public Bstackpageclass(WebDriver driver) {
		this.driver=driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	}
	
	public void demologin() {
		driver.findElement(By.id("signin")).click();
		driver.findElement(By.id("username")).click();
		driver.findElement(By.xpath("//div[text()='demouser']")).click();
		driver.findElement(By.id("password")).click();
		driver.findElement(By.xpath("//div[text()='testingisfun99']")).click();
		driver.findElement(By.id("login-btn")).click();
	}
	public void imagenotloadinguser() {
		driver.findElement(By.id("signin")).click();
		driver.findElement(By.id("username")).click();
		driver.findElement(By.xpath("//div[text()='image_not_loading_user']")).click();
		driver.findElement(By.id("password")).click();
		driver.findElement(By.xpath("//div[text()='testingisfun99']")).click();
		driver.findElement(By.id("login-btn")).click();
		
	}
	public void existingordersuser() {
		driver.findElement(By.id("signin")).click();
		driver.findElement(By.id("username")).click();
		driver.findElement(By.xpath("//div[text()='existing_orders_user']")).click();
		driver.findElement(By.id("password")).click();
		driver.findElement(By.xpath("//div[text()='testingisfun99']")).click();
		driver.findElement(By.id("login-btn")).click();
		
	}
	public void favuser() {
		driver.findElement(By.id("signin")).click();
		driver.findElement(By.id("username")).click();
		driver.findElement(By.xpath("//div[text()='fav_user']")).click();
		driver.findElement(By.id("password")).click();
		driver.findElement(By.xpath("//div[text()='testingisfun99']")).click();
		driver.findElement(By.id("login-btn")).click();
		
	}
	public void lockeduser() {
		driver.findElement(By.id("signin")).click();
		driver.findElement(By.id("username")).click();
		driver.findElement(By.xpath("//div[text()='locked_user']")).click();
		driver.findElement(By.id("password")).click();
		driver.findElement(By.xpath("//div[text()='testingisfun99']")).click();
		driver.findElement(By.id("login-btn")).click();
		
	}
	
	public void logout() {
		driver.findElement(By.id("signin")).click();
	}
	
	public void addtocart() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"1\"]/div[4]")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("div[class=\"float-cart__close-btn\"]")).click();
		
	}
	
	public void deleteitemfromcart() {
		driver.findElement(By.cssSelector("span[class=\"bag bag--float-cart-closed\"]")).click();
		driver.findElement(By.cssSelector("div[class=\"shelf-item__del\"]")).click();
		
	}
	
	public void shippingaddress()  {
//		String filePath = "src/test/resources/testdata\\Untitled spreadsheet.xlsx";
//	    String sheet = "Sheet1";
//
//	    String firstName = getCellData(filePath, sheet, 1, 0);
//	    String lastName = getCellData(filePath, sheet, 1, 1);
//	    String address1 = getCellData(filePath, sheet, 1, 2);
//	    String State = getCellData(filePath, sheet, 1, 3);
//	    String pin = getCellData(filePath, sheet, 1, 4);
//		driver.findElement(By.xpath("//*[@id=\"1\"]/div[4]")).click();
//		driver.findElement(By.cssSelector("div[class=\"buy-btn\"]")).click();
//		WebElement fname = driver.findElement(By.id("firstNameInput"));
//		fname.sendKeys(firstName);
//		fname.sendKeys(Keys.ENTER);
//		
//		WebElement lname = driver.findElement(By.id("lastNameInput"));
//		lname.sendKeys(lastName);
//		lname.sendKeys(Keys.ENTER);
//		
//		WebElement address = driver.findElement(By.id("addressLine1Input"));
//		address.sendKeys(address1);
//		address.sendKeys(Keys.ENTER);
//		
//		WebElement state = driver.findElement(By.id("provinceInput"));
//		state.sendKeys(State);
//		state.sendKeys(Keys.ENTER);
//		
//		WebElement Pin = driver.findElement(By.id("postCodeInput"));
//		Pin.sendKeys("533101");
//		Pin.sendKeys(Keys.ENTER);
//		
//		driver.findElement(By.id("checkout-shipping-continue")).click();
//		
//		driver.findElement(By.cssSelector("button[class=\"button button--tertiary optimizedCheckout-buttonSecondary\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"1\"]/div[4]")).click();
		driver.findElement(By.cssSelector("div[class=\"buy-btn\"]")).click();
		WebElement fname = driver.findElement(By.id("firstNameInput"));
		fname.sendKeys("Swaroop");
		fname.sendKeys(Keys.ENTER);
		
		WebElement lname = driver.findElement(By.id("lastNameInput"));
		lname.sendKeys("Bhyri");
		lname.sendKeys(Keys.ENTER);
		
		WebElement address = driver.findElement(By.id("addressLine1Input"));
		address.sendKeys("rjy");
		address.sendKeys(Keys.ENTER);
		
		WebElement state = driver.findElement(By.id("provinceInput"));
		state.sendKeys("Andhra Pradesh");
		state.sendKeys(Keys.ENTER);
		
		WebElement pin = driver.findElement(By.id("postCodeInput"));
		pin.sendKeys("533101");
		pin.sendKeys(Keys.ENTER);
		
		driver.findElement(By.id("checkout-shipping-continue")).click();
		
		driver.findElement(By.cssSelector("button[class=\"button button--tertiary optimizedCheckout-buttonSecondary\"]")).click();
	}
	
//	public void search(String input) {
//		driver.findElement(By.cssSelector("img[class=\"Navbar_logo__image__3Blki\"]")).click();
//		WebElement search = driver.findElement(By.cssSelector("input[placeholder=\"Search\"]"));
//		search.sendKeys(input);
//		search.sendKeys(Keys.ENTER);
//		driver.findElement(By.cssSelector("button[class=\"px-4 py-1 bg-gray-100 border border-l-0 border-gray-300\"]")).click();
//		driver.close();
//	}


	public void searchFor(String s) {
        WebElement searchElement = wait.until(ExpectedConditions.visibilityOfElementLocated(search));
        searchElement.sendKeys(s);
        wait.until(ExpectedConditions.elementToBeClickable(searchButton)).click();
    }
	public void apple() {
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/main/div[1]/div[1]/label/span")).click();
	}
	
	public void samsung() {
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/main/div[1]/div[2]/label/span")).click();
	}
	
	public void google() {
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/main/div[1]/div[3]/label/span")).click();
	}
	
	public void oneplus() {
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/main/div[1]/div[4]/label/span")).click();
	}
	
	public void favourites() {
		driver.findElement(By.xpath("//*[@id=\"1\"]/div[1]/button/span[1]")).click();
		
		driver.findElement(By.id("favourites")).click();
		
	}
	public void privacypolicy() {
		driver.findElement(By.cssSelector("img[class=\"Navbar_logo__image__3Blki\"]")).click();
		driver.findElement(By.cssSelector("span[style=\"right: 0%;\"][class=\"block absolute\"]")).click();
	}
	public void offers() {
		driver.findElement(By.id("offers")).click();
	}
	public void orderBy() {
		driver.findElement(By.cssSelector("img[class=\"Navbar_logo__image__3Blki\"]")).click();
		driver.findElement(By.cssSelector("select>option[value=\"lowestprice\"]")).click();
		
	}
	public static String getCellData(String filePath, String sheetName, int rowNum, int colNum) throws IOException {
        FileInputStream fis = new FileInputStream(filePath);
        Workbook workbook = new XSSFWorkbook(fis);
        Sheet sheet = workbook.getSheet(sheetName);
        Row row = sheet.getRow(rowNum);
        Cell cell = row.getCell(colNum);
        workbook.close();
        return cell.getStringCellValue();
    }

	public void Search(String q) {
		//driver.findElement(By.cssSelector("img[class=\"Navbar_logo_image_3Blki\"]")).click();
		WebElement search=driver.findElement(By.cssSelector("input[placeholder=\"Search\"]"));
		search.clear();
        search.sendKeys(q);
        search.sendKeys(Keys.ENTER);
		driver.findElement(By.cssSelector("button[class=\"px-4 py-1 bg-gray-100 border border-l-0 border-gray-300\"]")).click();
		
	        
	}
}
