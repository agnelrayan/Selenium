package grouping;

import org.testng.annotations.Test;

import junit.framework.Assert;

public class DependentEx {
	
	
	@Test(dependsOnMethods= {"openBrowser"})
	public void signIn() {
		System.out.println("This will execute SignIn");
	}
	
	@Test
	public void openBrowser() {
		System.out.println("This will executer When open the Browser");
		Assert.assertEquals("hi", "hii");
	}
	
	@Test(dependsOnMethods= {"signIn"})
	public void signOut() {
		System.out.println("Thies execute After the Sign In");
	}

}
