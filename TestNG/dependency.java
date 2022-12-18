package TestNG;

import org.testng.annotations.Test;

public class dependency {
	
	@Test(enabled =true)
	public void carmanufacturer() {
		System.out.println("Volvo company CEO...");
	}
	@Test(dependsOnMethods ="carmanufacturer")
    public void production() {
    	System.out.println("Volvo company car assemblers...");
	}
	@Test(dependsOnMethods ="production")
	public void Tech_employees() {
		System.out.println("Volvo company Tech_employess...");
	}
	@Test(dependsOnMethods = "Tech_employees")
	public void NonTech_employees() {
		System.out.println("Volvo company NonTech_Employees...");
	}
	@Test(dependsOnMethods = "NonTech_employees")
    public void customer() {
    	System.out.println("Volvo company purchasing customer...");
	}
	@Test(dependsOnMethods ="customer")
    public void deliverybay() {
    	System.out.println("Volvo car delivey...");
   	}
	
	
}
