import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class TestCaseIE {

	
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.ie.driver", "C:\\IEDriverServer_x64_3.150.1\\IEDriverServer.exe");

		WebDriver ie=new InternetExplorerDriver();
		ie.get("https://google.com");
		System.out.println(ie.getTitle());
	}

}
