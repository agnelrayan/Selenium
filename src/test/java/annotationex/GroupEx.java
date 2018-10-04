package annotationex;

import org.testng.annotations.Test;

public class GroupEx {
	
	@Test(groups= {"Car"})
	public void carFirst() {
		System.out.println("Car First...");
	}
	
	@Test(groups= {"Car"})
	public void carSecond() {
		System.out.print("Car Second...");
	}
	
	@Test(groups= {"Scooter"})
	public void scooterFirst() {
		System.out.println("Scooter First...");
	}
	
	@Test(groups= {"Scooter"})
	public void scooterSecond() {
		
		System.out.println("Scooter Second...");
		
	}

	@Test(groups= {"Car","Scooter"})
	public void swiftFirst() {
		
		System.out.println("Swift Test...");
		
	}
}
