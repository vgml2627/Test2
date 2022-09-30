package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Registration {

	WebDriver driver;
	
	By First_name=By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[1]/input");
	By Last_name=By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[2]/input");
	By Address=By.xpath("//*[@id=\"basicBootstrapForm\"]/div[2]/div/textarea");
	By email=By.xpath("//*[@id=\"eid\"]/input");
	By phone_number=By.xpath("//*[@id=\"basicBootstrapForm\"]/div[4]/div/input");
	By gender_male=By.xpath("//*[@id=\"basicBootstrapForm\"]/div[5]/div/label[1]/input");
	By gender_female=By.xpath("//*[@id=\"basicBootstrapForm\"]/div[5]/div/label[2]/input");
	By language=By.id("msdd");
	By skill=By.xpath("//*[@id=\"Skills\"]");
	//By country=By.id("countries");
	//By Select_country=By.xpath("//*[@id=\"basicBootstrapForm\"]/div[10]/div/span/span[1]/span");
	By password=By.id("firstpassword");
	By conf_password=By.id("secondpassword");
	By submit=By.id("submitbtn");
    By refresh=By.id("Button1");
    By hobbies=By.id("checkbox1");
	
	//creating constructor
    Registration(WebDriver d)
    {
    	driver=d;
    }
    
    public void firstname( String fname)
    {
    	driver.findElement(First_name).sendKeys(fname);
    }
    public void lastname( String lname)
    {
    	driver.findElement(Last_name).sendKeys(lname);
    }
    
    public void address(String add)
    {
    	driver.findElement(Address).sendKeys(add);
    }
    
    public void email(String mail)
    {
    	driver.findElement(email).sendKeys(mail);
    }
	
    public void phone (String number)
    {
    	driver.findElement(phone_number).sendKeys(number);
    }
    public void gender_male()
    {
    	boolean btn=driver.findElement(gender_male).isEnabled();
  
    }
    
    public void gender_female()
    {
    	driver.findElement(gender_female).click();
    }
    
    public void hobby()
    {
    	driver.findElement(hobbies).click();
    	
    }
  /*  public void language ()
    {
        driver.findElement(language);
        Select btn=new Select(driver.findElement(By.xpath("//*[@id=\"msdd\"]/div")));
        btn.selectByVisibleText("Bulgarian");
        btn.getOptions();
        System.out.println(btn);
        //btn.selectByVisibleText("Bulgarian");
    	}*/
    public void skill ()
    {
    	Select btn=new Select (driver.findElement(skill));
    	btn.selectByVisibleText("Adobe Photoshop");
    	btn.getOptions();
        System.out.println(btn);
        
    }
    public void password(String pass) {
    	driver.findElement(password).sendKeys(pass);
    }
    public void c_password(String conpass) {
    	driver.findElement(conf_password).sendKeys(conpass);
    	
    }
public void submit()
{
	driver.findElement(submit).click();
}

public void refresh()
{
	driver.findElement(refresh).click();
}


}














/*-------pom------
 * Organizing the page elements.
 * by using POM --object identification and operation/actions are separated by using different classes.
 * find element(By.id())---here By.id is the locator ...find element is a method
 */