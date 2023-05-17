package pack2;

import org.testng.SkipException;
import org.testng.annotations.Test;

//Skipping test cases

public class TestNG_5 {
	Boolean datasetup = true;
	//1st Method
	@Test(enabled=false)
	public void skipTest1() {
		System.out.println("Skipping this test as it is not completed.");
	}
	//2nd Method
	@Test
	public void skipTest2() {
		System.out.println("Skipping this test Forcefully.");
		throw new SkipException("Skipping this Test");
	}
	//3rd Method
	
	@Test
	public void skipTest3() {
		System.out.println("Skipping this test based on condition.");
		if(datasetup==false) {
			System.out.println("Execute the test");
		}
		else {
			System.out.println("Do not execute further steps.");
			throw new SkipException("Do not execute further steps.");
		}
	}
}
