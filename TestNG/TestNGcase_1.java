package TestNG;

import org.testng.annotations.Test;

public class TestNGcase_1 {

	@Test(priority =-1)
	public void Test_case1()
	{
		System.out.println("Execution One....");
	}
	@Test(priority =0)
	public void Test_case4()
	{
		System.out.println("Execution abort....");
	}
	@Test(priority =-2,enabled = false)
	public void Test_case2()
	{
		System.out.println("Execution Two....");
	}
	@Test(priority =2)
	public void Test_case3()
	{
		System.out.println("Execution Three....");
	}
	
}
//Attributes are:
/* "priority" based running
 * "enabled" by default for all testcase enable will be true so that its running the test case
*/