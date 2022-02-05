package module2;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SearchProduct extends ParentModule2{

	@BeforeTest
	public void checkSearchProductTest() {
		
		System.out.println("-----Check Search Product Test-----");
	}
	
	@Test
	public void testSearchProduct() {
		
		System.out.println("This is Search Product Test");
	}
	
	@AfterTest
	public void SearchProductTestClosure() {
		
		System.out.println("-----Search Product Test Closure-----");
	}
}
