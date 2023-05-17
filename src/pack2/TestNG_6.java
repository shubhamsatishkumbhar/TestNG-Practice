package pack2;

//Dependencies

import org.testng.annotations.Test;

public class TestNG_6 {
	
	@Test(dependsOnMethods= {"test2","test3"}) //Here you can use as well like dependsOnGroups={"Sanity","integration" or many others}
	public void test1() {
		System.out.println("I am inside test 1.");
	}
	@Test(priority=2)
	public void test2() {
		System.out.println("I am inside test 2.");
	}
	@Test
	public void test3() {
		System.out.println("I am inside test 3.");
	}
}
