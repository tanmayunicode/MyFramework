package module1;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

//Note:-> All annotations are developed with non static concept

public class RegisterTest extends ParentModule1{

	/*
	@BeforeMethod
	public void openBrowser() {
		
		System.out.println("Launch Browser");
	}
	*/
	
	@BeforeTest
	public void checkTestCase() {
		
		System.out.println("-----Check TestCase 1-----");
	}
	
	
	@Test(priority=1)
	public void positiveRegisterTest() {
		
		System.out.println("This is Positive Register Test");
	}
	
	
	@Test(priority=2)
	public void negativeRegisterTest() {
		
		System.out.println("This is Negative Register Test");
	}
	/*
	@AfterMethod
	public void closeBrowser() {
		
		System.out.println("Close Browser");
	}
	*/
	
	@AfterTest
	public void testCaseClosure() {
		
		System.out.println("-----TestCase Closure-----");
	}
}
