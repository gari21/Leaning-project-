import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multiplewindow {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\New folder\\drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	//	driver.manage().window().maximize();
		driver.navigate().to("http://www.popuptest.com/goodpopups.html");
		Thread.sleep(4000);
		driver.findElement(By.linkText("Good PopUp #2")).click();
		
		
		Thread.sleep(3000);
		
		//String parentwindow=driver.getWindowHandle();
		//System.out.println("Parent window id is"+parentwindow);
		Set<String> allwindows=driver.getWindowHandles();
	
		Iterator<String> itr=allwindows.iterator();
		String parentwindow=itr.next();
	
				System.out.println(parentwindow);
				
				String childwindow=itr.next();
				System.out.println(childwindow);
				driver.switchTo().window(childwindow);
				driver.close();
				driver.switchTo().window(parentwindow);
				
				
			
			
			
		}
		
		

	}




