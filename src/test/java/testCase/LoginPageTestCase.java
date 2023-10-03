package testCase;

import org.junit.Test;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import base.FrameworkBase;

public class LoginPageTestCase extends FrameworkBase {
	
	@BeforeClass()
	public void launchBroswermethod(){
		browserLaunch();
		
	}
	
	@Test()
	public void loginTestCase1() {
		System.out.println("my first test case");
	}
	
	@AfterClass()
	public void tearDown() {
		driver.quit();
	}

}
