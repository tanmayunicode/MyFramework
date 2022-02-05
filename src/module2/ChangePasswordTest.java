package module2;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ChangePasswordTest extends ParentModule2{

	@BeforeTest
	public void checkChangePwdTest() {
		
		System.out.println("-----Check Change Password Test-----");
	}
	
	@Test
	public void testChangePwd() {
		
		System.out.println("This is Change Password Test");
	}
	
	@AfterTest
	public void changePwdTestClosure() {
		
		System.out.println("-----Change Password Test Closure-----");
	}
}
