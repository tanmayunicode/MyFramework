package module1;

import org.testng.annotations.BeforeSuite;

public class ParentModule1 {

	@BeforeSuite
	public void checkBeforeSuite() {
		
		System.out.println("*********************This is BeforeSuite Annotation*********************");
	}
}
