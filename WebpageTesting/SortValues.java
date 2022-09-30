package WebpageTesting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SortValues {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","F:\\eclipse\\driver\\chromedriver.exe");	
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		Thread.sleep(3000);
		
		//Creating web element
		WebElement element=driver.findElement(By.id("animals"));
		
		//Storing web element value by using the select operation.
		Select btn=new Select(element);
		
	    //getting drop down values by using get-option() by using the select object
		List<WebElement>option=btn.getOptions();
		
		//Creating the array list to store the drop down values
	    List org_list=new ArrayList();
	    List temp_list=new ArrayList();
	    
	    //using for each loop and moving the value to e variable
	    for(WebElement e:option)
	    {
	    	//here adding value to the array
	    	org_list.add(e.getText());
	        temp_list.add(e.getText());
	    }
		System.out.println("Before sorting.."+org_list);
		System.out.println("Before sorting.."+temp_list);
		
		//Here it will sort the drop down value in temp_list.
		Collections.sort(temp_list);
		//Collections.sort(org_list);

		
		System.out.println("After sorting.."+org_list);
		System.out.println("After sorting.."+temp_list);
		
		if(org_list.equals(temp_list))
		{
			System.out.println("Sorting done equally....");
		}
		else
		{
			System.out.println("Sorting not done equally.....");	
		}
		
		Thread.sleep(5000);
		driver.close();
	
	}
        }
