package cookies;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getCookies {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","F:\\eclipse\\driver\\chromedriver.exe");	
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://buyofuel.com/");
		
		//getting the cookies from the browser from the page we browse.
		Set <Cookie> cookies=driver.manage().getCookies();
		System.out.println("The size the cookie in buyofuel is:.."+cookies.size());
		
		//using for each loop
		for(Cookie cookie:cookies)
		{
			//System.out.println(cookie.getName()+":"+cookie.getValue());
			//System.out.println(cookie.getPath());
			String value=cookie.getName();
			//getting cookie name
			System.out.println(driver.manage().getCookieNamed(value));
		}
		
		//adding cookies
		Cookie cobj=new Cookie("aaa122", "dddd4567");
		driver.manage().addCookie(cobj);
		
		cookies=driver.manage().getCookies();
		System.out.println("The size the cookie in buyofuel is:.."+cookies.size());
		for(Cookie cookie:cookies)
		{
			//System.out.println(cookie.getName()+":"+cookie.getValue());
			//System.out.println(cookie.getPath());
			String value=cookie.getName();
			//getting cookie name
			System.out.println(driver.manage().getCookieNamed(value));
		}
		
		
		//deleting the cookies
		
		driver.manage().deleteCookie(cobj);
		cookies=driver.manage().getCookies();
		System.out.println("The size the cookie in buyofuel is:.."+cookies.size());
		for(Cookie cookie:cookies)
		{
			//System.out.println(cookie.getName()+":"+cookie.getValue());
			//System.out.println(cookie.getPath());
			String value=cookie.getName();
			//getting cookie name
			System.out.println(driver.manage().getCookieNamed(value));
		}
       //deleting all cookies
		driver.manage().deleteAllCookies();
		cookies=driver.manage().getCookies();
		System.out.println("The size the cookie in buyofuel is:.."+cookies.size());
		
		
				
	}
     
}
/* -----cookies properties-----
 * getname()-----return the name of browsed web application
 * getvalue()-----return the value in binary or auto generated format
 * issecure()----return true or false
 * getdomain()-----return the domain name of web application
*/




/*****cookies commands****
 * driver.manage.getcookies()
 * driver.manage.getcookieNamed()
 * driver.manage.addcookie()
 * driver.manage.deletecookie()
 * driver.manage.deleteAllcookie()
 * driver.manage.deleteNamedcookie()
 *
  */
