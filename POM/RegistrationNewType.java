package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v102.page.Page;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationNewType {
	WebDriver driver;
	
	@FindBy(xpath="//*[@id=\"App\"]/div[2]/div[1]/div/div/div/div[2]/div/div[2]/form/input[1]")
	WebElement name;
	
	
	@FindBy(xpath="//*[@id=\"App\"]/div[2]/div[1]/div/div/div/div[2]/div/div[2]/form/input[2]")
	WebElement email;
	
	@FindBy(xpath="//*[@id=\"App\"]/div[2]/div[1]/div/div/div/div[2]/div/div[2]/form/input[3]")
	WebElement password;
	
	@FindBy(xpath="//*[@id=\"App\"]/div[2]/div[1]/div/div/div/div[2]/div/div[2]/form/input[4]")
	WebElement number;
	
	//Constructor
	RegistrationNewType(WebDriver d)
	{
		driver=d;
		PageFactory.initElements(d,this); 
		//addition method to start the driver because we have used @findby annotation
	}
	public void username(String Name)
	{
		name.sendKeys(Name);
	}
    public void mail(String mail_id)
    {
    	email.sendKeys(mail_id);
    }
    public void pwd(String Pass)
    {
    	password.sendKeys(Pass);
    }
    public void numeric(String num)
    {
    	number.sendKeys(num);
    }

}

