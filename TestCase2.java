import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * 
 */

/**
 * @author vamsi
 *
 */
public class TestCase2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//WebDriver fire=new FirefoxDriver();
		driver.get("https://google.com");
		System.out.println(driver.getTitle());
	}

}
