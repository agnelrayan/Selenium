package grouping;

import org.testng.annotations.Test;

public class GroupingEx2 {
	
	@Test(groups= {"car"})
	public void carTestOne() {
		System.out.println("Car Test One Method...");
	}

	@Test(groups = {"car"})
	public void carTestTwo() {
		System.out.println("Car Test Two Method...");
	}
	
	@Test(groups= {"scootter"})
	public void scootterTestOne() {
		System.out.println("Scooter test One Method....");
	}
	
	@Test(groups= {"scootter"})
	public void scootterTestTwo() {
		System.out.println("Scooter Test Two Method...");
	}
	
}
