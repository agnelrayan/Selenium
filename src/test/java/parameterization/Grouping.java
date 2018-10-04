package parameterization;

import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class Grouping {
	
	@BeforeGroups("Car--Login")
	public void beforeGroups() {
		System.out.println("Before Groups is executing...");
		
	}
			
	@Test(groups= {"Car"})
	public void carMethod1() {
		System.out.println("Car Method1....");
		
	}
	
	@Test(groups = {"Car"})
	public void carMethod2()
	{
		System.out.println("Car Method2...");
		
	}
	
	@Test(groups = {"Scooter"})
	public void scooterMethod1() {
		System.out.println("Scooter Method1....");
	}
	
	@Test(groups = {"Scooter"})
	public void scooterMethod2() {
		System.out.println("Scooter Method2....");
	}
	
	@Test(groups = {"Scooter","Thomas"})
	public void scooterMethod3() {
		System.out.println("Scooter Method3...Thomas");
	}
	
	@Test(groups = {"Car","BMW"})
	public void carBMW() {
		System.out.println("Car---BMW Method...");
	}
	
	

}
