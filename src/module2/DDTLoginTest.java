package module2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DDTLoginTest {

	
	WebDriver driver = null;
	
	@BeforeTest
	public void launchBrowser() {

		System.setProperty("webdriver.chrome.driver",
				"D:\\Software\\Testing-Tools\\Selenium\\WebDriver\\Drivers\\IEChromeFirefox\\ChromeBrowser\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}

	@Test(dataProvider="getTestData")
	public void testHTMLElements(String username, String pwd) throws InterruptedException {

		driver.get("http://localhost/uth/gadgetsgallery/catalog/index.php");

		WebElement loginLink = driver.findElement(By.linkText("log yourself in"));
		loginLink.click();

		driver.findElement(By.name("email_address")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(pwd);

		driver.findElement(By.id("tdb1")).click();

		Thread.sleep(2000); // Pause

		driver.findElement(By.linkText("Mobile Phones")).click();
		driver.findElement(By.linkText("Log Off")).click();

		driver.findElement(By.id("tdb1")).click();

		driver.findElement(By.partialLinkText("create ")).click();
		driver.findElement(By.xpath("//input[@name='gender']")).click();
		driver.findElement(By.id("dob")).sendKeys("01/21/2010");

		new Select(driver.findElement(By.name("country"))).selectByVisibleText("India");

		driver.findElement(By.name("newsletter")).click();

	}

	@DataProvider
	public Object[][] getTestData() {
		
		Object data[][] = new Object[3][3];
		
		data[0][0] = "demo@unicodetechnologies.in";
		data[0][1] = "unicode";
		data[0][2] = "Tanmay";
		
		data[1][0] = "demo1@unicodetechnologies.in";
		data[1][1] = "unicode1";
		data[1][2] = "Vivek";

		data[2][0] = "demo2@unicodetechnologies.in";
		data[2][1] = "unicode2";
		data[2][2] = "Roshni";

		return data;
	}
	
	
	

}
