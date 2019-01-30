import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipkartlogin {

	

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "D:\\New folder\\drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://google.co.in");
		Thread.sleep(3000);
		
		
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//driver.findElement(By.className("_2AkmmA _29YdH8")).click();
		
		List<WebElement> links=driver.findElements(By.tagName("a"));
		List<WebElement> activelinks= new ArrayList<WebElement>();
		System.out.println(links.size());
		for(int i=0;i<links.size();i++)
		{
			if (links.get(i).getAttribute("href")!=null)
			{
				activelinks.add(links.get(i));
				System.out.println(activelinks.size());
				
			}
		}
	
	for(int j=0;j<=activelinks.size();j++)
	{
				URL linkurl=new URL(activelinks.get(j).getAttribute("href"));
				HttpURLConnection htp=(HttpURLConnection)linkurl.openConnection();
				htp.connect();
				String response=htp.getResponseMessage();//ok
				htp.disconnect();
				System.out.println(activelinks.get(j).getAttribute("href")+response);
			}
			
			
			}
				
		}
		
			
			
		
		//Thread.sleep(4000);
		//driver.findElement(By.className("_2AkmmA _29YdH8")).click();
		//find total noumber of links
		//List<WebElement> links=driver.findElements(By.xpath("//a"));
		
		
		
		
		
	


