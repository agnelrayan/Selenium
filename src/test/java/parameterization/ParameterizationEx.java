package parameterization;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterizationEx {
	@Parameters({"suite-level-param"})
	@Test
	public void firstTest(String param) {
		System.out.println(param);
		
	}
	
	@Parameters({"test-level-param"})
	@Test
	public void secondTest(String param) {
		System.out.println(param);
		
	}
	
	@Parameters({"suite-level-param","test-level-param"})
	@Test
	public void thirdTest(String suiteParam,String param) {
		System.out.println("SuiteParam:"+suiteParam+"Test level param:"+param);
		
	}
	
	

}
