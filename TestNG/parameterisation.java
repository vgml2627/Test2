package TestNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parameterisation {

@Test
@Parameters("test")
public void parameter(String name)
{
	System.out.println("testing the paramaeter working flow..."+name);
}
}


//running the test case through xml file