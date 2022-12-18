	package TestNG;

import org.testng.annotations.Test;

public class grouping {

	@Test(groups= {"bus"})
	public void bus1()
	{
	System.out.println("hi i am bus 1...");	
	}
	@Test(groups= {"bus"})
	public void bus2()
	{
		System.out.println("hi i am bus 2...");		
	}
	@Test(groups= {"bike"})
	public void bike1() 
	{
		System.out.println("hi i am bike 1...");	
	}
	@Test(groups= {"bike"})
	public void bike2() 
	{
		System.out.println("hi i am bike 2...");		
	}
	@Test(groups= {"cycle"})
	public void cycle1()
	{
		System.out.println("hi i am cycle 1...");	
	}
	@Test(groups= {"cycle"})
	public void cycle2()
	{
		System.out.println("hi i am cycle 2...");	
	}


}
