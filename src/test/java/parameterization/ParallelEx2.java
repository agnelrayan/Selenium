package parameterization;

import org.testng.annotations.Test;

public class ParallelEx2 {
	
	@Test
	public void testOne() throws InterruptedException {
		for(int i=0;i<5;i++) {
		System.out.println("Test One..."+i);
		Thread.sleep(2000);
		}
	}
	
	@Test
	public void testTwo() throws InterruptedException {
		for(int i=100;i<105;i++) {
		System.out.println("Test Two..."+i);
		Thread.sleep(2000);
		}
	}
	
	@Test
	public void testThree() throws InterruptedException {
		for(int i=200;i<205;i++) {
		System.out.println("Test Three..."+i);
		Thread.sleep(2000);
		}
	}

}
