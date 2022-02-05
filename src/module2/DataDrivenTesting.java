package module2;

import org.testng.annotations.DataProvider;

//1. Create a method in the class where DDT is implemented and provide annotation as "DataProvider" 
//2. Store all test data in the form of two dimensional object array
//3. Return two dimensional object array
//4. Mention name of the dataprovider for @Test(dataProvider="name of the method from where data is coming")
//5. Method's arguments will be same as the column number
//6. Use argument's variable in the script

import org.testng.annotations.Test;

public class DataDrivenTesting {
	
	@Test(dataProvider="getTestData")
	public void testDDT(String email, String pwd) {
		
		System.out.println("Hello...My Email Address is: "+email+" and My Password is: "+pwd);
		
	}
	
	@DataProvider
	public Object[][] getTestData() {
		
		Object data[][] = new Object[3][2];
		
		data[0][0] = "demo@unicodetechnologies.in";
		data[0][1] = "unicode";
		
		data[1][0] = "demo1@unicodetechnologies.in";
		data[1][1] = "unicode1";
		
		data[2][0] = "demo2@unicodetechnologies.in";
		data[2][1] = "unicode2";
		
		return data;
		
	}
	
	
	

}
