package pack2;

import org.testng.annotations.Test;

//Grouping test Cases
//Making the group of test cases/
//To run the cases according to group 
//Right click here-->click on Run as-->Run configuration-->Click on group-->Browse-->Select group-->Apply and run

@Test(groups="User-Registration") //It is common group for overall class
public class TestNG_3 {
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
