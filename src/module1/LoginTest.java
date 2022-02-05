package module1;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginTest extends ParentModule1{

	@BeforeTest
	public void checkLoginTest() {
		
		System.out.println("-----Check Login Test-----");
	}
	
	@Test
	public void testLogin() {
		
		System.out.println("This is Login Test");
	}
	
	@AfterTest
	public void loginTestClosure() {
		
		System.out.println("-----Login Test Closure-----");
	}
}
