package module1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HTMLElementsTestNG {

	
	WebDriver driver = null;
	
	@BeforeTest
	public void launchBrowser() {

		System.setProperty("webdriver.chrome.driver",
				"D:\\Software\\Testing-Tools\\Selenium\\WebDriver\\Drivers\\IEChromeFirefox\\ChromeBrowser\\new\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("http://localhost/uth/gadgetsgallery/catalog/index.php");
	}

	@Test
	public void testHTMLElements() throws InterruptedException {

		WebElement loginLink = driver.findElement(By.linkText("log yourself in"));
		loginLink.click();

		// driver.findElement(By.linkText("log yourself in")).click();

		driver.findElement(By.name("email_address")).sendKeys("demo2@unicodetechnologies.in");
		driver.findElement(By.name("password")).sendKeys("unicode2");
		driver.findElement(By.name("password")).sendKeys(Keys.ENTER);
		
	//	driver.findElement(By.name("keywords")).clear();
		
		
		//driver.findElement(By.id("tdb1")).click();

		Thread.sleep(2000); // Pause

		driver.findElement(By.linkText("Mobile Phones")).click();
		driver.findElement(By.linkText("Log Off")).click();

		driver.findElement(By.id("tdb1")).click();

		driver.findElement(By.partialLinkText("create ")).click();
		// driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/form/div/div[2]/table/tbody/tr[1]/td[2]/input[1]")).click();
		driver.findElement(By.xpath("//input[@name='gender']")).click();
		driver.findElement(By.id("dob")).sendKeys("01/21/2010");

		/*
		 * WebElement countryDD = driver.findElement(By.name("country")); //Line 1
		 * Select country = new Select(countryDD); //Line 2
		 * country.selectByVisibleText("India"); //Line 3
		 */

		new Select(driver.findElement(By.name("country"))).selectByVisibleText("India");

		driver.findElement(By.name("newsletter")).click();

	}

	@AfterTest
	public void closeBrowser() throws InterruptedException {

		Thread.sleep(5000);

		driver.close();
	}

}
