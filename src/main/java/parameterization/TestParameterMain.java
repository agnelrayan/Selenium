package parameterization;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestParameterMain {
@Parameters({"browser"})
@Test
public void testCaseOne(String browser) {
	System.out.println("browser passed as:"+browser);
}

@Parameters({"username","password"})
@Test

public void testCaseTwo(String username,String password) {
	System.out.println("Parameter for UserName passed as:"+username);
	System.out.println("Parameter for Password passed as:"+password);
}

@Parameters({"firstname","lastname"})
@Test
public void testCaseThree(String firstname,String lastname) {
	System.out.println("Parameter for FirstName passed as:"+firstname);
	System.out.println("Parameter for LastName passed as:"+lastname);
}
	
}
