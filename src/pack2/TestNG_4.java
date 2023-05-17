package pack2;

import org.testng.annotations.Test;

//Creating Test Suits
//Right click on Package --> Click on TestNG-->Click on Convert to Test NG-->Click on Finish(Your xml file will generate)

public class TestNG_4 {
	@Test(priority=1,groups="regression")
	public void atest() {
		System.out.println("test1");
	}
	@Test(priority=2,groups="regression")
	public void btest() {
		System.out.println("test2");
	}
	@Test(groups={"regression","bvt"})
	public void ctest() {
		System.out.println("test3");
	}
	@Test(groups="bvt")
	public void dtest() {
		System.out.println("test4");
	}
}
