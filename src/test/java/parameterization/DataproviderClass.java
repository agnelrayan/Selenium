package parameterization;

import org.testng.annotations.DataProvider;

public class DataproviderClass {
	@DataProvider(name="searchProvider")
    public static Object[][] getData(){
	return new Object[][]{
		
		{"9159767562","91597677562"},
		{"9159767562","91597677562"},
		{"9159767562","91597677562"}
		
	
			
	};
	
}

}
