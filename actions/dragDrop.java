package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dragDrop {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","F:\\eclipse\\driver\\chromedriver.exe");	
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		Thread.sleep(3000);
		Actions act=new Actions(driver);
		//drag and drop we are performing three operation
		/*click and hold
		 * move to the element
		 * Release the element in the target.
		 */
		WebElement source=driver.findElement(By.id("box3"));
		String a=source.getText();
		WebElement target=driver.findElement(By.id("box104"));
		String b=target.getText();
        //act.clickAndHold(source).moveToElement(target).release().build().perform();
		//.....shortcut command....
		act.dragAndDrop(source, target).build().perform();
        Thread.sleep(3000);
        System.out.println("The selected captial is.."+a+"  "+"and the selected State is.."+b);
		//drag and drop command...
		Thread.sleep(3000);
		driver.close();
		
		
	}

}
