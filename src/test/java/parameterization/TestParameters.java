package parameterization;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestParameters {
	
	
	@Test
	@Parameters({"browser"})
	public void testCaseOne(String browser) {
		System.out.println("Selected Browser:"+browser);
		
	}
	
	@Test
	@Parameters({("username"),"password"})
	public void testCaseTwo(String username,String password) {
		
		System.out.println("UserName is:"+username);
		System.out.println("Password is:"+password);
	}
	
	

}
