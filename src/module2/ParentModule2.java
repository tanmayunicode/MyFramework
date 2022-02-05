package module2;

import org.testng.annotations.BeforeSuite;

public class ParentModule2 {

	@BeforeSuite
	public void checkBeforeSuite2() {
		
		System.out.println("*********************This is BeforeSuite Annotation 2*********************");
	}
}
