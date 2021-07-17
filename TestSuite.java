import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.ie.InternetExplorerDriver;
public class TestSuite {

	public static void main(String[] args) {
		System.setProperty("webdriver.ie.driver", "C:\\IEDriverServer_x64_3.150.1\\IEDriverServer.exe");
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//InternetExplorerDriver ie=new InternetExplorerDriver();
		//driver.get("https://google.com");
		//System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		System.out.println("going to youtube");
		driver.get("https://www.aha.video");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		System.out.println("going back");
		driver.navigate().back();
		System.out.println("going to google");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		System.out.println("going to youtube");
		System.out.println("going forward");
		driver.navigate().forward();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		System.out.println("going back");
		driver.navigate().back();
		System.out.println(driver.getCurrentUrl());
		
		driver.get("https://fb.com");

		driver.close();	
				
		//ie.get("https://wiki.com");
		//System.out.println(ie.getTitle());
		//System.out.println(ie.getCurrentUrl());
	//ie.quit();
		

	}

}
